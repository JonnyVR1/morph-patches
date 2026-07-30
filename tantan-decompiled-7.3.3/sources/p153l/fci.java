package p153l;

import com.p051p1.mobile.putong.data.Settings;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.feed.FeedModule;

/* JADX INFO: loaded from: classes13.dex */
public class fci {

    /* JADX INFO: renamed from: a */
    public User f98217a;

    /* JADX INFO: renamed from: l.fci$a */
    public static class C16948a {

        /* JADX INFO: renamed from: b */
        public static C16948a f98218b = new C16948a(new fci(FeedModule.m61406H().me_()));

        /* JADX INFO: renamed from: a */
        public fci f98219a;

        public C16948a(fci fciVar) {
            this.f98219a = fciVar;
            mrb0.m159624B().subscribe(psd0.m173596G(new y20() { // from class: l.eci
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f93060a.m125013b((User) obj);
                }
            }));
        }

        /* JADX INFO: renamed from: c */
        public static void m125012c() {
            f98218b = new C16948a(new fci(FeedModule.m61406H().me_()));
        }

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ void m125013b(User user) {
            this.f98219a.f98217a = user;
        }
    }

    public fci(User user) {
        this.f98217a = user;
    }

    /* JADX INFO: renamed from: a */
    public int m125010a() {
        Settings settings;
        User user = this.f98217a;
        if (user == null || (settings = user.settings) == null || jyb.m147479J(settings.settingGroups) || this.f98217a.settings.settingGroups.get(0) == null || this.f98217a.settings.settingGroups.get(0).momentLevel == null) {
            return -1;
        }
        return this.f98217a.settings.settingGroups.get(0).momentLevel.level;
    }
}
