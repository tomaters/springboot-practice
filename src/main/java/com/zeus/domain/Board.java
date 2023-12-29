package com.zeus.domain;

import java.io.Serializable;

//import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Getter
//@Setter
//@NoArgsConstructor
//@RequiredArgsConstructor
//@ToString (exclude = "regDate")
//@EqualsAndHashCode(of = "boardNo")
@Data
//@Builder
@NoArgsConstructor
public class Board implements Serializable {
	public static final long serialVersionUID = 1L;
//	@NonNull 
	private Integer boardNo;
//	@NonNull
	private String title;
	private String content;
	private String writer;
//	private Date regDate;
}
