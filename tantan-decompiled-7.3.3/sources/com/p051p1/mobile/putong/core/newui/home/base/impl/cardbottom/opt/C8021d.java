package com.p051p1.mobile.putong.core.newui.home.base.impl.cardbottom.opt;

import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.CoreSuggested;
import com.p051p1.mobile.putong.core.data.CoreMomentInfo;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.VoiceLiveState;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p153l.gj40;
import p153l.oql;
import p153l.t7m;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.cardbottom.opt.d */
/* JADX INFO: loaded from: classes11.dex */
public class C8021d implements oql {

    /* JADX INFO: renamed from: a */
    public CoreSuggested.UserInfo f22770a;

    /* JADX INFO: renamed from: b */
    public User f22771b;

    /* JADX INFO: renamed from: c */
    public CoreMomentInfo f22772c;

    /* JADX INFO: renamed from: d */
    public boolean f22773d;

    /* JADX INFO: renamed from: f */
    public boolean f22775f;

    /* JADX INFO: renamed from: g */
    public t7m f22776g;

    /* JADX INFO: renamed from: h */
    public boolean f22777h;

    /* JADX INFO: renamed from: i */
    public boolean f22778i;

    /* JADX INFO: renamed from: e */
    public boolean f22774e = false;

    /* JADX INFO: renamed from: k */
    public HashMap<CardBottomFrame, Integer> f22780k = new HashMap<>();

    /* JADX INFO: renamed from: l */
    public HashMap<CardBottomFrame, Integer> f22781l = new HashMap<>();

    /* JADX INFO: renamed from: j */
    public a f22779j = new a();

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.cardbottom.opt.d$a */
    public class a {

        /* JADX INFO: renamed from: b */
        public VoiceLiveState f22783b;

        /* JADX INFO: renamed from: d */
        public List<String> f22785d;

        /* JADX INFO: renamed from: e */
        public Map<String, String> f22786e;

        /* JADX INFO: renamed from: f */
        public gj40.C17227h f22787f;

        /* JADX INFO: renamed from: g */
        public List<String> f22788g;

        /* JADX INFO: renamed from: h */
        public String f22789h;

        /* JADX INFO: renamed from: a */
        public CardBottomFrame f22782a = null;

        /* JADX INFO: renamed from: c */
        public boolean f22784c = false;

        /* JADX INFO: renamed from: i */
        public int f22790i = 0;

        public a() {
        }

        /* JADX INFO: renamed from: a */
        public void m38499a(boolean z) {
            if (this.f22784c) {
                return;
            }
            this.f22784c = z;
        }
    }

    /* JADX INFO: renamed from: a */
    public int m38476a(CardBottomFrame cardBottomFrame) {
        if (this.f22781l.containsKey(cardBottomFrame)) {
            return this.f22781l.get(cardBottomFrame).intValue();
        }
        return -1;
    }

    /* JADX INFO: renamed from: b */
    public String m38477b() {
        if (NullChecker.m82486a(this.f22771b) && !this.f22771b.isMe()) {
            return this.f22771b.f56859id;
        }
        return "default_" + System.currentTimeMillis();
    }

    /* JADX INFO: renamed from: c */
    public boolean m38478c() {
        return this.f22778i;
    }

    /* JADX INFO: renamed from: d */
    public boolean m38479d() {
        return NullChecker.m82486a(this.f22770a) && CoreModule.f18264c.f20405m0.m32023L6(this.f22770a.f20214id);
    }

    @Override // p153l.oql
    /* JADX INFO: renamed from: e */
    public boolean mo38480e() {
        CoreSuggested.UserInfo userInfo = this.f22770a;
        return (userInfo == null || this.f22772c == null || !userInfo.isCoreMomentCard) ? false : true;
    }

    @Override // p153l.oql
    /* JADX INFO: renamed from: f */
    public t7m mo38481f() {
        return this.f22776g;
    }

    @Override // p153l.oql
    /* JADX INFO: renamed from: g */
    public boolean mo38482g() {
        return this.f22773d;
    }

    @Override // p153l.oql
    public User getUser() {
        return this.f22771b;
    }

    @Override // p153l.oql
    public CoreSuggested.UserInfo getUserInfo() {
        return this.f22770a;
    }

    @Override // p153l.oql
    /* JADX INFO: renamed from: h */
    public CoreMomentInfo mo38483h() {
        return this.f22772c;
    }

    /* JADX INFO: renamed from: i */
    public boolean m38484i() {
        return NullChecker.m82486a(this.f22770a) && CoreModule.f18264c.f20405m0.m32027M6(this.f22770a.f20214id);
    }

    /* JADX INFO: renamed from: j */
    public boolean m38485j() {
        CoreSuggested.UserInfo userInfo = this.f22770a;
        return (userInfo == null || this.f22772c == null || !userInfo.isCoreMomentThemeCard) ? false : true;
    }

    /* JADX INFO: renamed from: k */
    public boolean m38486k() {
        return this.f22774e;
    }

    /* JADX INFO: renamed from: l */
    public boolean m38487l() {
        return this.f22775f;
    }

    /* JADX INFO: renamed from: m */
    public void m38488m(t7m t7mVar) {
        this.f22776g = t7mVar;
    }

    /* JADX INFO: renamed from: n */
    public void m38489n(boolean z) {
        this.f22778i = z;
    }

    /* JADX INFO: renamed from: o */
    public void m38490o(boolean z) {
        this.f22777h = z;
    }

    /* JADX INFO: renamed from: p */
    public void m38491p(CoreMomentInfo coreMomentInfo) {
        this.f22772c = coreMomentInfo;
    }

    /* JADX INFO: renamed from: q */
    public void m38492q(boolean z) {
        this.f22774e = z;
    }

    /* JADX INFO: renamed from: r */
    public void m38493r(boolean z) {
        this.f22775f = z;
    }

    /* JADX INFO: renamed from: s */
    public void m38494s(boolean z) {
        this.f22773d = z;
    }

    /* JADX INFO: renamed from: t */
    public void m38495t(User user) {
        this.f22771b = user;
    }

    /* JADX INFO: renamed from: u */
    public void m38496u(CoreSuggested.UserInfo userInfo) {
        this.f22770a = userInfo;
    }

    /* JADX INFO: renamed from: v */
    public void m38497v(CardBottomFrame cardBottomFrame, int i) {
        this.f22781l.put(cardBottomFrame, Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: w */
    public void m38498w(CardBottomFrame cardBottomFrame, int i) {
        this.f22780k.put(cardBottomFrame, Integer.valueOf(i));
    }
}
