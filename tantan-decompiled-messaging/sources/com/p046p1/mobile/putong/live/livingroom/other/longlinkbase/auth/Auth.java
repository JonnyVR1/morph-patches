package com.p046p1.mobile.putong.live.livingroom.other.longlinkbase.auth;

import com.p046p1.mobile.putong.live.livingroom.other.longlinkbase.call.AbstractC12886a;

/* JADX INFO: loaded from: classes4.dex */
public abstract class Auth extends AbstractC12886a {
    public Auth(Object obj, long j) {
        super(obj, j);
    }

    public static class AuthException extends Exception {
        public AuthException(String str) {
            super(str);
        }

        public AuthException(Exception exc) {
            super(exc);
        }
    }
}
