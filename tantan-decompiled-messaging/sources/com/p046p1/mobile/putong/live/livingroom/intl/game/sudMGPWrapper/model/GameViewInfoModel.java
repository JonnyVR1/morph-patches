package com.p046p1.mobile.putong.live.livingroom.intl.game.sudMGPWrapper.model;

/* JADX INFO: loaded from: classes4.dex */
public class GameViewInfoModel {
    public int ret_code;
    public String ret_msg;
    public GameViewSizeModel view_size = new GameViewSizeModel();
    public GameViewRectModel view_game_rect = new GameViewRectModel();

    public static class GameViewRectModel {
        public int bottom;
        public int left;
        public int right;
        public int top;
    }

    public static class GameViewSizeModel {
        public int height;
        public int width;
    }
}
