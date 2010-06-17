package com.arrimurri.testapp

import com.vaadin.Application
import com.vaadin.ui._

class TestServlet extends Application {
	
	override def init = {
		val main = new Window("New Window")

		val l = new Label("hello label")
		val l2 = new Label("hello label2")

		main addComponent l
		main addComponent l2

		setMainWindow(main)
	}
}
