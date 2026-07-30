package com.p046p1.mobile.putong.core.newui.home.base.impl.cardbottom.opt;

import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.CoreSuggested;
import com.p046p1.mobile.putong.core.data.CoreMomentInfo;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.VoiceLiveState;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p149l.d5m;
import p149l.dol;
import p149l.sa40;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.cardbottom.opt.d */
/* JADX INFO: loaded from: classes11.dex */
public class C7870d implements dol {

    /* JADX INFO: renamed from: a */
    public CoreSuggested.UserInfo f22028a;

    /* JADX INFO: renamed from: b */
    public User f22029b;

    /* JADX INFO: renamed from: c */
    public CoreMomentInfo f22030c;

    /* JADX INFO: renamed from: d */
    public boolean f22031d;

    /* JADX INFO: renamed from: f */
    public boolean f22033f;

    /* JADX INFO: renamed from: g */
    public d5m f22034g;

    /* JADX INFO: renamed from: h */
    public boolean f22035h;

    /* JADX INFO: renamed from: i */
    public boolean f22036i;

    /* JADX INFO: renamed from: e */
    public boolean f22032e = false;

    /* JADX INFO: renamed from: k */
    public HashMap<CardBottomFrame, Integer> f22038k = new HashMap<>();

    /* JADX INFO: renamed from: l */
    public HashMap<CardBottomFrame, Integer> f22039l = new HashMap<>();

    /* JADX INFO: renamed from: j */
    public a f22037j = new a();

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.cardbottom.opt.d$a */
    public class a {

        /* JADX INFO: renamed from: b */
        public VoiceLiveState f22041b;

        /* JADX INFO: renamed from: d */
        public List<String> f22043d;

        /* JADX INFO: renamed from: e */
        public Map<String, String> f22044e;

        /* JADX INFO: renamed from: f */
        public sa40.C19884h f22045f;

        /* JADX INFO: renamed from: g */
        public List<String> f22046g;

        /* JADX INFO: renamed from: h */
        public String f22047h;

        /* JADX INFO: renamed from: a */
        public CardBottomFrame f22040a = null;

        /* JADX INFO: renamed from: c */
        public boolean f22042c = false;

        /* JADX INFO: renamed from: i */
        public int f22048i = 0;

        public a() {
        }

        /* JADX INFO: renamed from: a */
        public void m37496a(boolean z) {
            if (this.f22042c) {
                return;
            }
            this.f22042c = z;
        }
    }

    /* JADX INFO: renamed from: a */
    public int m37473a(CardBottomFrame cardBottomFrame) {
        if (this.f22039l.containsKey(cardBottomFrame)) {
            return this.f22039l.get(cardBottomFrame).intValue();
        }
        return -1;
    }

    /* JADX INFO: renamed from: b */
    public String m37474b() {
        if (NullChecker.m81303a(this.f22029b) && !this.f22029b.isMe()) {
            return this.f22029b.f56011id;
        }
        return "default_" + System.currentTimeMillis();
    }

    /* JADX INFO: renamed from: c */
    public boolean m37475c() {
        return this.f22036i;
    }

    /* JADX INFO: renamed from: d */
    public boolean m37476d() {
        return NullChecker.m81303a(this.f22028a) && CoreModule.f17545c.f19663m0.m31020L6(this.f22028a.f19472id);
    }

    @Override // p149l.dol
    /* JADX INFO: renamed from: e */
    public boolean mo37477e() {
        CoreSuggested.UserInfo userInfo = this.f22028a;
        return (userInfo == null || this.f22030c == null || !userInfo.isCoreMomentCard) ? false : true;
    }

    @Override // p149l.dol
    /* JADX INFO: renamed from: f */
    public d5m mo37478f() {
        return this.f22034g;
    }

    @Override // p149l.dol
    /* JADX INFO: renamed from: g */
    public boolean mo37479g() {
        return this.f22031d;
    }

    @Override // p149l.dol
    public User getUser() {
        return this.f22029b;
    }

    @Override // p149l.dol
    public CoreSuggested.UserInfo getUserInfo() {
        return this.f22028a;
    }

    @Override // p149l.dol
    /* JADX INFO: renamed from: h */
    public CoreMomentInfo mo37480h() {
        return this.f22030c;
    }

    /* JADX INFO: renamed from: i */
    public boolean m37481i() {
        return NullChecker.m81303a(this.f22028a) && CoreModule.f17545c.f19663m0.m31024M6(this.f22028a.f19472id);
    }

    /* JADX INFO: renamed from: j */
    public boolean m37482j() {
        CoreSuggested.UserInfo userInfo = this.f22028a;
        return (userInfo == null || this.f22030c == null || !userInfo.isCoreMomentThemeCard) ? false : true;
    }

    /* JADX INFO: renamed from: k */
    public boolean m37483k() {
        return this.f22032e;
    }

    /* JADX INFO: renamed from: l */
    public boolean m37484l() {
        return this.f22033f;
    }

    /* JADX INFO: renamed from: m */
    public void m37485m(d5m d5mVar) {
        this.f22034g = d5mVar;
    }

    /* JADX INFO: renamed from: n */
    public void m37486n(boolean z) {
        this.f22036i = z;
    }

    /* JADX INFO: renamed from: o */
    public void m37487o(boolean z) {
        this.f22035h = z;
    }

    /* JADX INFO: renamed from: p */
    public void m37488p(CoreMomentInfo coreMomentInfo) {
        this.f22030c = coreMomentInfo;
    }

    /* JADX INFO: renamed from: q */
    public void m37489q(boolean z) {
        this.f22032e = z;
    }

    /* JADX INFO: renamed from: r */
    public void m37490r(boolean z) {
        this.f22033f = z;
    }

    /* JADX INFO: renamed from: s */
    public void m37491s(boolean z) {
        this.f22031d = z;
    }

    /* JADX INFO: renamed from: t */
    public void m37492t(User user) {
        this.f22029b = user;
    }

    /* JADX INFO: renamed from: u */
    public void m37493u(CoreSuggested.UserInfo userInfo) {
        this.f22028a = userInfo;
    }

    /* JADX INFO: renamed from: v */
    public void m37494v(CardBottomFrame cardBottomFrame, int i) {
        this.f22039l.put(cardBottomFrame, Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: w */
    public void m37495w(CardBottomFrame cardBottomFrame, int i) {
        this.f22038k.put(cardBottomFrame, Integer.valueOf(i));
    }
}
