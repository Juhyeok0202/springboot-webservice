package com.cotato.book.springboot.domain.config.auth;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * LoginUser라는 Anntation이 (개발자에 의해)생성
 * [@interface로 LoginUser라는 Anntation 생성.]
 */

//이 Anntation이 생성될 수 있는 위치를 지정합니다.
//PARAMETER로 지정했으니 메소드의 파라미터로 선언된 객체에서만 사용가능.
//(이 외에도 클래스 선언문에 쓸 수 있는 TYPE 등이 있다.)
@Target(ElementType.PARAMETER)
@Retention(RetentionPolicy.RUNTIME) //Anntation의 Life-Cycle을 지정( RUNTIME까지 남아 있는다 )
public @interface LoginUser {
}
