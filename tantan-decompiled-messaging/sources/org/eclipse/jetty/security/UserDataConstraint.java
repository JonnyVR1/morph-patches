package org.eclipse.jetty.security;

import p149l.k250;

/* JADX INFO: loaded from: classes3.dex */
public enum UserDataConstraint {
    None,
    Integral,
    Confidential;

    public static UserDataConstraint get(int i) {
        if (i >= -1 && i <= 2) {
            return i == -1 ? None : values()[i];
        }
        k250.m144273a("Expected -1, 0, 1, or 2, not: ", i);
        return null;
    }

    public UserDataConstraint combine(UserDataConstraint userDataConstraint) {
        return compareTo(userDataConstraint) < 0 ? this : userDataConstraint;
    }
}
