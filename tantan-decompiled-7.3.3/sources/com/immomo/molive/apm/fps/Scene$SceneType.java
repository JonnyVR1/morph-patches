package com.immomo.molive.apm.fps;

import kotlin.Metadata;
import org.eclipse.jetty.util.security.Constraint;
import p153l.p7f;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, m88121d2 = {"com/immomo/molive/apm/fps/Scene$SceneType", "", "Lcom/immomo/molive/apm/fps/Scene$SceneType;", "", p7f.TAG_SCENE_TYPE, "<init>", "(Ljava/lang/String;II)V", Constraint.NONE, "WEB_ACTIVITY_SHOW", "WEB_DIALOG_SHOW", "LUA_DIALOG_SHOW", "LUA_PAGE_SHOW", "SVGA_SHOW", "ROOM_BANNER_SHOW", "apm-tracer_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public enum Scene$SceneType {
    NONE(0),
    WEB_ACTIVITY_SHOW(1),
    WEB_DIALOG_SHOW(2),
    LUA_DIALOG_SHOW(3),
    LUA_PAGE_SHOW(4),
    SVGA_SHOW(5),
    ROOM_BANNER_SHOW(6);

    Scene$SceneType(int i) {
    }
}
