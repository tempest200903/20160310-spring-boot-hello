package com.example;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/desicion")
public class DesicionTableController {

	@RequestMapping(method = RequestMethod.GET)
	public String hello(Model model) {
		String[] titles = { "Windows 上で実行する場合、事前にディレクトリ rscript-sjis が存在しない場合はテスト失敗とする。", //
				"クラスタリング ステージ=予測", //
				"入力ファイルは bodais サンプルデータをベースにしている", };
		List<DesicionCause> desicionCauseList = new ArrayList<>();
		for (String title : titles) {
			desicionCauseList.add(new DesicionCause(title));
		}
		model.addAttribute("desicionCauseList", desicionCauseList);

		return "desicion";
	}

}
