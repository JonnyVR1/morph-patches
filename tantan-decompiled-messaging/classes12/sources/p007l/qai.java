package p007l;

import com.p000p1.mobile.putong.data.Settings;
import com.p000p1.mobile.putong.data.User;
import com.p000p1.mobile.putong.feed.FeedModule;
import l.e30;
import l.mkd0;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class qai {

    /* JADX INFO: renamed from: a */
    public User f12179a;

    /* JADX INFO: renamed from: l.qai$a */
    public static class C2467a {

        /* JADX INFO: renamed from: b */
        public static C2467a f12180b = new C2467a(new qai(FeedModule.m1140H().me_()));

        /* JADX INFO: renamed from: a */
        public qai f12181a;

        public C2467a(qai qaiVar) {
            this.f12181a = qaiVar;
            ijb0.m10891B().subscribe(mkd0.G(new e30() { // from class: l.pai
                public final void call(Object obj) {
                    this.f11754a.m13500b((User) obj);
                }
            }));
        }

        /* JADX INFO: renamed from: c */
        public static void m13499c() {
            f12180b = new C2467a(new qai(FeedModule.m1140H().me_()));
        }

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ void m13500b(User user) {
            this.f12181a.f12179a = user;
        }
    }

    public qai(User user) {
        this.f12179a = user;
    }

    /* JADX INFO: renamed from: a */
    public int m13497a() {
        Settings settings;
        User user = this.f12179a;
        if (user == null || (settings = user.settings) == null || vwb.J(settings.settingGroups) || this.f12179a.settings.settingGroups.get(0) == null || this.f12179a.settings.settingGroups.get(0).momentLevel == null) {
            return -1;
        }
        return this.f12179a.settings.settingGroups.get(0).momentLevel.level;
    }
}
