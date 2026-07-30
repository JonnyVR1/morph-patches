package com.p051p1.mobile.putong.live.livingroom.other.longlinkbase.auth;

import com.p051p1.mobile.putong.live.livingroom.other.longlinkbase.call.AbstractC13049a;

/* JADX INFO: loaded from: classes5.dex */
public abstract class Auth extends AbstractC13049a {
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
