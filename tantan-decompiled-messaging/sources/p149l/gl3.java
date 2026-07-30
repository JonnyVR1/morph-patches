package p149l;

/* JADX INFO: loaded from: classes13.dex */
public class gl3 {

    /* JADX INFO: renamed from: a */
    public zpd0 f103280a = new zpd0("last_activities_entry_reddot" + l9s.m149093o0(), 0L, false);

    /* JADX INFO: renamed from: b */
    public hpd0 f103281b;

    /* JADX INFO: renamed from: c */
    public zpd0 f103282c;

    /* JADX INFO: renamed from: d */
    public zpd0 f103283d;

    /* JADX INFO: renamed from: e */
    public hpd0 f103284e;

    /* JADX INFO: renamed from: f */
    public zpd0 f103285f;

    /* JADX INFO: renamed from: g */
    public v9p f103286g;

    /* JADX INFO: renamed from: h */
    public w9p f103287h;

    /* JADX INFO: renamed from: i */
    public hpd0 f103288i;

    /* JADX INFO: renamed from: j */
    public z9p f103289j;

    /* JADX INFO: renamed from: k */
    public hpd0 f103290k;

    public gl3() {
        String str = "need_show_start_live_red_point" + l9s.m149093o0();
        Boolean bool = Boolean.TRUE;
        this.f103281b = new hpd0(str, bool);
        this.f103282c = new zpd0("live_sign_time" + l9s.m149093o0(), 0L);
        this.f103283d = new zpd0("live_activity_start_live_time" + l9s.m149093o0(), 0L);
        String str2 = "live_square_live_video_show" + l9s.m149093o0();
        Boolean bool2 = Boolean.FALSE;
        this.f103284e = new hpd0(str2, bool2);
        this.f103285f = new zpd0("is_show_fake_voiceRedPointToady" + l9s.m149093o0(), 0L);
        this.f103286g = new v9p("intl_frame_cdn_info_" + l9s.m149093o0(), null);
        this.f103287h = new w9p("intl_frame_info_" + l9s.m149093o0(), null);
        this.f103288i = new hpd0("indonesia_chatroom_exp_" + l9s.m149093o0(), bool);
        this.f103289j = new z9p("intl_game_operation_reddot_info_" + l9s.m149093o0(), null);
        this.f103290k = new hpd0("intl_game_tab_has_shown" + l9s.m149093o0(), bool2);
    }

    /* JADX INFO: renamed from: a */
    public long m126738a() {
        return this.f103283d.get().longValue();
    }

    /* JADX INFO: renamed from: b */
    public long m126739b() {
        return this.f103282c.get().longValue();
    }

    /* JADX INFO: renamed from: c */
    public boolean m126740c() {
        return this.f103284e.get().booleanValue();
    }

    /* JADX INFO: renamed from: d */
    public boolean m126741d() {
        return this.f103281b.get().booleanValue();
    }

    /* JADX INFO: renamed from: e */
    public void m126742e() {
        this.f103280a.put(Long.valueOf(System.currentTimeMillis()));
    }

    /* JADX INFO: renamed from: f */
    public void m126743f(long j) {
        this.f103283d.put(Long.valueOf(j));
    }

    /* JADX INFO: renamed from: g */
    public void m126744g(long j) {
        this.f103282c.put(Long.valueOf(j));
    }

    /* JADX INFO: renamed from: h */
    public void m126745h(boolean z) {
        this.f103284e.put(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: i */
    public void m126746i(boolean z) {
        this.f103281b.put(Boolean.valueOf(z));
    }
}
