package com.servlet.handle;

import com.servlet.mapper.RuneMapper;
import com.servlet.pojo.Rune;
import com.servlet.util.SqlSessionFactoryUtil;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Controller
public class RuneController {
    @RequestMapping("/getrunes.do")
    public List<Rune> getRunes() {
        SqlSession s1 = SqlSessionFactoryUtil.sqlSessionFactory.openSession();
        RuneMapper runeMapper = s1.getMapper(RuneMapper.class);
        List<Rune> runeList = runeMapper.getRunes();
        s1.close();
        return runeList;
    }

    @RequestMapping("/insertrune.do")
    public void insertRune(HttpServletRequest request, HttpServletResponse response) {
        try {
            SqlSession s1 = SqlSessionFactoryUtil.sqlSessionFactory.openSession();
            RuneMapper runeMapper = s1.getMapper(RuneMapper.class);

            Rune rune = new Rune();
            rune.setRuneName(request.getParameter("rune_name"));
            rune.setWeapInfo(request.getParameter("weap_info"));
            rune.setArmrInfo(request.getParameter("armr_info"));
            rune.setShidInfo(request.getParameter("shid_info"));

            runeMapper.insertRune(rune);
            s1.commit();
            s1.close();

            response.sendRedirect("index.jsp");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}