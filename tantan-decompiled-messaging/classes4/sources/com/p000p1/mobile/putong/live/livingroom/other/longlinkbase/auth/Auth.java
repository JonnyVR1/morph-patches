package com.p000p1.mobile.putong.live.livingroom.other.longlinkbase.auth;

import com.p000p1.mobile.putong.live.livingroom.other.longlinkbase.call.AbstractC0475a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public abstract class Auth extends AbstractC0475a {
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
