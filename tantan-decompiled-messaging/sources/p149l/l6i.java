package p149l;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.view.View;
import android.widget.LinearLayout;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.data.ReminderAction;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.data.MomentVoiceLiveInfos;

/* JADX INFO: loaded from: classes12.dex */
public class l6i extends AbstractC17936k7 implements e5i {

    /* JADX INFO: renamed from: a */
    public xa70 f126642a;

    /* JADX INFO: renamed from: b */
    public wlh f126643b;

    public l6i(zll zllVar, xa70 xa70Var) {
        this.f126643b = (wlh) zllVar;
        this.f126642a = xa70Var;
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m148734n(View view) {
    }

    /* JADX INFO: renamed from: t */
    private wlh m148737t() {
        return this.f126643b;
    }

    @Override // p149l.g6i
    /* JADX INFO: renamed from: b */
    public boolean mo124591b(xa70 xa70Var) {
        Moment moment = xa70Var.f191689a;
        return moment != null && moment.isVoiceLive;
    }

    @Override // p149l.g6i
    /* JADX INFO: renamed from: c */
    public void mo124592c(xa70 xa70Var) {
        this.f126642a = xa70Var;
    }

    @Override // p149l.g6i
    /* JADX INFO: renamed from: j */
    public void mo115059j() {
        m148737t().f186935j.setOnClickListener(new View.OnClickListener() { // from class: l.h6i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                l6i.m148734n(view);
            }
        });
    }

    @Override // p149l.AbstractC17936k7
    /* JADX INFO: renamed from: l */
    public void mo144642l(xa70 xa70Var) {
        MomentVoiceLiveInfos momentVoiceLiveInfos;
        this.f126642a = xa70Var;
        Moment moment = xa70Var.f191689a;
        if (!moment.isVoiceLive || (momentVoiceLiveInfos = moment.momentVoiceLiveInfos) == null || momentVoiceLiveInfos.momentVoiceUser == null || "from_live_square_tab".equals(xa70Var.f191690b)) {
            return;
        }
        this.f126643b.f186940o.setVisibility(8);
        this.f126643b.f186947v.setVisibility(0);
        m148737t().f186944s.m64719c(Color.parseColor("#35d3ff"), Color.parseColor("#35d3ff"));
        qib0.f154691G.m102318F(qib0.f154691G.m184724n(xa70Var.f191689a.momentVoiceLiveInfos.momentVoiceUser.momentAvatar).m8607O(new nvc0(m148737t().f186944s.getAvatarSize(), m148737t().f186944s.getAvatarSize())).m8614a(), new e30() { // from class: l.i6i
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f111746a.m148742v((Bitmap) obj);
            }
        });
        this.f126643b.f186944s.setVisibility(0);
        this.f126643b.f186935j.setVisibility(0);
        this.f126643b.f186936k.setText("加入");
        this.f126643b.f186936k.setTextColor(-1);
        this.f126643b.f186936k.setTextSize(2, 12.0f);
        this.f126643b.f186935j.setBackgroundResource(f3c0.f94666y1);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f126643b.f186936k.getLayoutParams();
        layoutParams.width = xdl0.m208407w(44.0f);
        layoutParams.height = xdl0.m208407w(28.0f);
        this.f126643b.f186936k.setPadding(0, 0, 0, 0);
        this.f126643b.f186936k.setGravity(17);
        this.f126643b.f186936k.setLayoutParams(layoutParams);
        this.f126643b.f186946u.setText(xa70Var.f191689a.momentVoiceLiveInfos.momentVoiceUser.momentName);
        if (!m148743w().momentVoiceLiveInfos.momentVoiceUser.momentIsAnchor) {
            for (int i = 0; i < this.f126643b.f186945t.getChildCount(); i++) {
                this.f126643b.f186945t.getChildAt(i).setVisibility(8);
            }
        }
        this.f126643b.f186946u.setVisibility(0);
        this.f126643b.f186913K.setVisibility(0);
        this.f126643b.f186915M.setText(xa70Var.f191689a.momentVoiceLiveInfos.momentVoiceUser.momentDesc);
        this.f126643b.f186916N.setVisibility(8);
        this.f126643b.f186917O.setVisibility(8);
        this.f126643b.f186918P.setVisibility(8);
        this.f126643b.f186919Q.setVisibility(8);
        this.f126643b.f186909G.setVisibility(8);
        this.f126643b.f186912J.setVisibility(8);
        this.f126643b.f186914L.setVisibility(0);
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f126643b.f186915M.getLayoutParams();
        layoutParams2.leftMargin = xdl0.m208407w(4.0f);
        this.f126643b.f186915M.setLayoutParams(layoutParams2);
        String str = xa70Var.f191689a.momentVoiceLiveInfos.momentVoiceUser.momentDescStatus;
        str.getClass();
        switch (str) {
            case "follow":
                this.f126643b.f186914L.setImageResource(f3c0.f94282A1);
                break;
            case "superLike":
                this.f126643b.f186914L.setImageResource(f3c0.f94306D1);
                break;
            case "like":
                this.f126643b.f186914L.setImageResource(f3c0.f94298C1);
                break;
            case "match":
                this.f126643b.f186914L.setImageResource(f3c0.f94290B1);
                break;
            default:
                this.f126643b.f186914L.setVisibility(8);
                layoutParams2.leftMargin = 0;
                this.f126643b.f186915M.setLayoutParams(layoutParams2);
                break;
        }
        if (m148740s()) {
            m148739r(this.f126643b.f186946u);
        }
        wlh wlhVar = this.f126643b;
        vwb.m200354z(vwb.m200324f0(wlhVar.f186938m, wlhVar.f186940o), new e30() { // from class: l.j6i
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f116477a.m148739r((View) obj);
            }
        });
        m148739r(this.f126643b.f186944s);
        m148739r(this.f126643b.f186936k);
    }

    /* JADX INFO: renamed from: q */
    public Act m148738q() {
        return this.f126642a.f191695g;
    }

    /* JADX INFO: renamed from: r */
    public void m148739r(final View view) {
        view.setOnClickListener(new View.OnClickListener() { // from class: l.k6i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f121468a.m148741u(view, view2);
            }
        });
    }

    /* JADX INFO: renamed from: s */
    public final boolean m148740s() {
        return (!m148743w().isVoiceLive || m148743w().momentVoiceLiveInfos == null || m148743w().momentVoiceLiveInfos.momentVoiceUser.momentIsAnchor) ? false : true;
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m148741u(View view, View view2) {
        String str;
        wlh wlhVar = this.f126643b;
        if (view == wlhVar.f186944s) {
            str = ReminderAction.photo;
        } else {
            str = view == wlhVar.f186936k ? "enter_room" : "content";
        }
        f5i.m119505d(this.f126642a, m148738q(), m148743w());
        Moment momentM148743w = m148743w();
        xa70 xa70Var = this.f126642a;
        osg.m165776k(momentM148743w, xa70Var.f191696h + 1, z5i.m217340u(xa70Var.f191690b), z5i.m217339t(this.f126642a.f191690b), str);
        Moment momentM148743w2 = m148743w();
        xa70 xa70Var2 = this.f126642a;
        osg.m165772g(momentM148743w2, xa70Var2.f191690b, xa70Var2.f191691c, null);
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m148742v(Bitmap bitmap) {
        m148737t().f186944s.setAvatar(bitmap);
    }

    /* JADX INFO: renamed from: w */
    public Moment m148743w() {
        return this.f126642a.f191689a;
    }

    @Override // p149l.g6i
    /* JADX INFO: renamed from: f */
    public void mo115052f() {
    }

    @Override // p149l.g6i
    /* JADX INFO: renamed from: h */
    public void mo115056h() {
    }

    @Override // p149l.AbstractC17936k7, p149l.g6i
    /* JADX INFO: renamed from: d */
    public void mo124593d(xa70 xa70Var) {
    }

    @Override // p149l.AbstractC17936k7
    /* JADX INFO: renamed from: m */
    public void mo144643m(xa70 xa70Var) {
    }
}
