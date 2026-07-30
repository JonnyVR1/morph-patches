package com.p000p1.mobile.putong.core.p004ui.visitor.frag;

import com.p000p1.mobile.putong.account.data.CameraSticker;
import com.p1.mobile.putong.core.data.UserPrivilege;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p006l.xma;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(k = CameraSticker.STATE_COMPLETE, mv = {2, 2, 0}, xi = 48)
public final /* synthetic */ class VisitorTabPresenter$initSubscription$12 extends FunctionReferenceImpl implements Function1<UserPrivilege, Boolean> {
    public static final VisitorTabPresenter$initSubscription$12 INSTANCE = new VisitorTabPresenter$initSubscription$12();

    public VisitorTabPresenter$initSubscription$12() {
        super(1, xma.class, "isExpired", "isExpired(Lcom/p1/mobile/putong/core/data/UserPrivilege;)Z", 0);
    }

    public final Boolean invoke(UserPrivilege userPrivilege) {
        return Boolean.valueOf(xma.m27363T3(userPrivilege));
    }
}
