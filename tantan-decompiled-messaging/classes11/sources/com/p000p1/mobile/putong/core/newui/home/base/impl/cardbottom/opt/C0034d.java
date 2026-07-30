package com.p000p1.mobile.putong.core.newui.home.base.impl.cardbottom.opt;

import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.api.CoreSuggested;
import com.p1.mobile.putong.core.data.CoreMomentInfo;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.VoiceLiveState;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import l.sa40;
import p009l.d5m;
import p009l.dol;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.cardbottom.opt.d */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class C0034d implements dol {

    /* JADX INFO: renamed from: a */
    public CoreSuggested.UserInfo f806a;

    /* JADX INFO: renamed from: b */
    public User f807b;

    /* JADX INFO: renamed from: c */
    public CoreMomentInfo f808c;

    /* JADX INFO: renamed from: d */
    public boolean f809d;

    /* JADX INFO: renamed from: f */
    public boolean f811f;

    /* JADX INFO: renamed from: g */
    public d5m f812g;

    /* JADX INFO: renamed from: h */
    public boolean f813h;

    /* JADX INFO: renamed from: i */
    public boolean f814i;

    /* JADX INFO: renamed from: e */
    public boolean f810e = false;

    /* JADX INFO: renamed from: k */
    public HashMap<CardBottomFrame, Integer> f816k = new HashMap<>();

    /* JADX INFO: renamed from: l */
    public HashMap<CardBottomFrame, Integer> f817l = new HashMap<>();

    /* JADX INFO: renamed from: j */
    public a f815j = new a();

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.cardbottom.opt.d$a */
    public class a {

        /* JADX INFO: renamed from: b */
        public VoiceLiveState f819b;

        /* JADX INFO: renamed from: d */
        public List<String> f821d;

        /* JADX INFO: renamed from: e */
        public Map<String, String> f822e;

        /* JADX INFO: renamed from: f */
        public sa40.h f823f;

        /* JADX INFO: renamed from: g */
        public List<String> f824g;

        /* JADX INFO: renamed from: h */
        public String f825h;

        /* JADX INFO: renamed from: a */
        public CardBottomFrame f818a = null;

        /* JADX INFO: renamed from: c */
        public boolean f820c = false;

        /* JADX INFO: renamed from: i */
        public int f826i = 0;

        public a() {
        }

        /* JADX INFO: renamed from: a */
        public void m1467a(boolean z) {
            if (this.f820c) {
                return;
            }
            this.f820c = z;
        }
    }

    /* JADX INFO: renamed from: a */
    public int m1444a(CardBottomFrame cardBottomFrame) {
        if (this.f817l.containsKey(cardBottomFrame)) {
            return this.f817l.get(cardBottomFrame).intValue();
        }
        return -1;
    }

    /* JADX INFO: renamed from: b */
    public String m1445b() {
        if (NullChecker.a(this.f807b) && !this.f807b.isMe()) {
            return ((DbObject) this.f807b).id;
        }
        return "default_" + System.currentTimeMillis();
    }

    /* JADX INFO: renamed from: c */
    public boolean m1446c() {
        return this.f814i;
    }

    /* JADX INFO: renamed from: d */
    public boolean m1447d() {
        return NullChecker.a(this.f806a) && CoreModule.c.m0.L6(this.f806a.id);
    }

    @Override // p009l.dol
    /* JADX INFO: renamed from: e */
    public boolean mo1448e() {
        CoreSuggested.UserInfo userInfo = this.f806a;
        return (userInfo == null || this.f808c == null || !userInfo.isCoreMomentCard) ? false : true;
    }

    @Override // p009l.dol
    /* JADX INFO: renamed from: f */
    public d5m mo1449f() {
        return this.f812g;
    }

    @Override // p009l.dol
    /* JADX INFO: renamed from: g */
    public boolean mo1450g() {
        return this.f809d;
    }

    @Override // p009l.dol
    public User getUser() {
        return this.f807b;
    }

    @Override // p009l.dol
    public CoreSuggested.UserInfo getUserInfo() {
        return this.f806a;
    }

    @Override // p009l.dol
    /* JADX INFO: renamed from: h */
    public CoreMomentInfo mo1451h() {
        return this.f808c;
    }

    /* JADX INFO: renamed from: i */
    public boolean m1452i() {
        return NullChecker.a(this.f806a) && CoreModule.c.m0.M6(this.f806a.id);
    }

    /* JADX INFO: renamed from: j */
    public boolean m1453j() {
        CoreSuggested.UserInfo userInfo = this.f806a;
        return (userInfo == null || this.f808c == null || !userInfo.isCoreMomentThemeCard) ? false : true;
    }

    /* JADX INFO: renamed from: k */
    public boolean m1454k() {
        return this.f810e;
    }

    /* JADX INFO: renamed from: l */
    public boolean m1455l() {
        return this.f811f;
    }

    /* JADX INFO: renamed from: m */
    public void m1456m(d5m d5mVar) {
        this.f812g = d5mVar;
    }

    /* JADX INFO: renamed from: n */
    public void m1457n(boolean z) {
        this.f814i = z;
    }

    /* JADX INFO: renamed from: o */
    public void m1458o(boolean z) {
        this.f813h = z;
    }

    /* JADX INFO: renamed from: p */
    public void m1459p(CoreMomentInfo coreMomentInfo) {
        this.f808c = coreMomentInfo;
    }

    /* JADX INFO: renamed from: q */
    public void m1460q(boolean z) {
        this.f810e = z;
    }

    /* JADX INFO: renamed from: r */
    public void m1461r(boolean z) {
        this.f811f = z;
    }

    /* JADX INFO: renamed from: s */
    public void m1462s(boolean z) {
        this.f809d = z;
    }

    /* JADX INFO: renamed from: t */
    public void m1463t(User user) {
        this.f807b = user;
    }

    /* JADX INFO: renamed from: u */
    public void m1464u(CoreSuggested.UserInfo userInfo) {
        this.f806a = userInfo;
    }

    /* JADX INFO: renamed from: v */
    public void m1465v(CardBottomFrame cardBottomFrame, int i) {
        this.f817l.put(cardBottomFrame, Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: w */
    public void m1466w(CardBottomFrame cardBottomFrame, int i) {
        this.f816k.put(cardBottomFrame, Integer.valueOf(i));
    }
}
