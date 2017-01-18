!**********************************************************************
!** bbpager.bb: Style file for bbpager when using Blackbox           **
!**********************************************************************

! ** auto reconfigure when config-file has changed **
!bbpager.autoConfig:                False
! ** number of seconds between checks **
!bbpager.autoConfig.checkTimeout:   10

!** position of bbpager window **
bbpager.position:               +0-0

!** width and height of the pagers model of the desktop windows **
bbpager.desktop.width:          40
bbpager.desktop.height:         30

!** define the number of columns, the number of row will grow as
!** desktops are added (vertical orientation) 
bbpager.columns:               1

!** define the number of rows, the number of columns will grow as
!** desktops are added (horizontal orientation) 
bbpager.rows:                  4

!** bbpager on top of other windows **
bbpager.raised:                 True

!** set the window docus style none, border or texture
!bbpager.window.focusStyle:      texture

!**define focused desktop style none, border or texture
!bbpager.desktop.focusStyle:	 border
!** focused desktop
!bbpager.desktop.focus:		 Raised Gradient Vertical Bevel1
!bbpager.desktop.focus.color:	 darkslategrey
!bbpager.desktop.focus.colorTo:	 slategrey

!** change mouse button action, 
!** button 1 = left mouse button, 2 middle, 3 right etc.
!** you can define mutiple functions to a mouse button, like raise & focus
bbpager.desktopChangeButton:	1
bbpager.windowMoveButton:    3
bbpager.windowFocusButton:	2
bbpager.windowRaiseButton:	2

! *************************************************************
! ** By default the values below this point are taken from   **
! ** the Blackbox style.                                     **
! ** If you want to override something just uncomment it     **
! ** and change the value                                    **
! *************************************************************

!** set bevelwidth
!bbpager.bevelWidth:             4

!** define frame style **
!bbpager.frame:                 Raised Gradient Vertical Bevel1
!bbpager.frame.color:           slategrey
!bbpager.frame.colorTo:         darkslategrey

!** define pager-desktop window style **
!bbpager.desktop:               Sunken Gradient Vertical Bevel1
!bbpager.desktop.color:         slategrey
!bbpager.desktop.colorTo:	darkslategrey

!** define pager-window style **
!bbpager.window:                Raised Gradient Vertical Bevel1
!bbpager.window.color:          slategrey
!bbpager.window.colorTo:        darkslategrey

!** define pager-window style **
!bbpager.window.focus:          Raised Gradient Vertical Bevel1
!bbpager.window.focus.color:    rgb:c/9/6
!bbpager.window.focus.colorTo:  rgb:8/6/4

!bbpager.active.window.borderColor:	lightgrey
!bbpager.inactive.window.borderColor:	black
!bbpager.active.desktop.borderColor:	lightgrey
