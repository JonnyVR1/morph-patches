package com.p046p1.mobile.putong.core.newui.onlinezone;

import com.p046p1.mobile.putong.core.data.UserPrivilege;
import com.p046p1.mobile.putong.data.User;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p149l.j760;
import p149l.q860;
import p149l.vwb;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m87233k = 3, m87234mv = {2, 2, 0}, m87236xi = 48)
public final /* synthetic */ class OnlineZonePresenter$initSubscription$9 extends FunctionReferenceImpl implements Function2<UserPrivilege, q860<User>, j760<UserPrivilege, q860<User>>> {
    public static final OnlineZonePresenter$initSubscription$9 INSTANCE = new OnlineZonePresenter$initSubscription$9();

    public OnlineZonePresenter$initSubscription$9() {
        super(2, vwb.class, "pair", "pair(Ljava/lang/Object;Ljava/lang/Object;)Landroidx/core/util/Pair;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final j760<UserPrivilege, q860<User>> invoke(UserPrivilege userPrivilege, q860<User> q860Var) {
        return vwb.m200311Y(userPrivilege, q860Var);
    }
}
