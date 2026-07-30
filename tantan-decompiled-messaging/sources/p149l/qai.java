package p149l;

import com.p046p1.mobile.putong.data.Settings;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.feed.FeedModule;

/* JADX INFO: loaded from: classes12.dex */
public class qai {

    /* JADX INFO: renamed from: a */
    public User f153537a;

    /* JADX INFO: renamed from: l.qai$a */
    public static class C19451a {

        /* JADX INFO: renamed from: b */
        public static C19451a f153538b = new C19451a(new qai(FeedModule.m60222H().me_()));

        /* JADX INFO: renamed from: a */
        public qai f153539a;

        public C19451a(qai qaiVar) {
            this.f153539a = qaiVar;
            ijb0.m136538B().subscribe(mkd0.m154955G(new e30() { // from class: l.pai
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f147979a.m173738b((User) obj);
                }
            }));
        }

        /* JADX INFO: renamed from: c */
        public static void m173737c() {
            f153538b = new C19451a(new qai(FeedModule.m60222H().me_()));
        }

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ void m173738b(User user) {
            this.f153539a.f153537a = user;
        }
    }

    public qai(User user) {
        this.f153537a = user;
    }

    /* JADX INFO: renamed from: a */
    public int m173735a() {
        Settings settings;
        User user = this.f153537a;
        if (user == null || (settings = user.settings) == null || vwb.m200296J(settings.settingGroups) || this.f153537a.settings.settingGroups.get(0) == null || this.f153537a.settings.settingGroups.get(0).momentLevel == null) {
            return -1;
        }
        return this.f153537a.settings.settingGroups.get(0).momentLevel.level;
    }
}
