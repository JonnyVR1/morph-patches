package p002l;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.operation.view.multiple.LiveMarqueeTextView;
import com.p000p1.mobile.putong.live.livingroom.other.liveend.LiveEndDataItemView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.live.base.data.BLiveOfficialShowSummary;
import com.p1.mobile.putong.live.base.data.BLiveSummary;
import l.hxs;
import l.jbu;
import l.s7m;
import l.t100;
import l.uvr;
import l.x8u;
import l.xdl0;
import v.VDraweeView;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class c8s implements s7m<z7s> {

    /* JADX INFO: renamed from: a */
    public VDraweeView f8544a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f8545b;

    /* JADX INFO: renamed from: c */
    public VText f8546c;

    /* JADX INFO: renamed from: d */
    public TextView f8547d;

    /* JADX INFO: renamed from: e */
    public LiveEndDataItemView f8548e;

    /* JADX INFO: renamed from: f */
    public LiveEndDataItemView f8549f;

    /* JADX INFO: renamed from: g */
    public LiveEndDataItemView f8550g;

    /* JADX INFO: renamed from: h */
    public LiveEndDataItemView f8551h;

    /* JADX INFO: renamed from: i */
    public LiveEndDataItemView f8552i;

    /* JADX INFO: renamed from: j */
    public LiveEndDataItemView f8553j;

    /* JADX INFO: renamed from: k */
    public LinearLayout f8554k;

    /* JADX INFO: renamed from: l */
    public LiveEndDataItemView f8555l;

    /* JADX INFO: renamed from: m */
    public LiveEndDataItemView f8556m;

    /* JADX INFO: renamed from: n */
    public LiveEndDataItemView f8557n;

    /* JADX INFO: renamed from: o */
    public LinearLayout f8558o;

    /* JADX INFO: renamed from: p */
    public LiveMarqueeTextView f8559p;

    /* JADX INFO: renamed from: q */
    public VImage f8560q;

    /* JADX INFO: renamed from: c */
    private void m10902c(BLiveSummary bLiveSummary) {
        String str;
        this.f8548e.setValueText(jbu.W(bLiveSummary.duration * 1000));
        String strC = x8u.c(bLiveSummary.rewardPoint);
        if (uvr.d().s0()) {
            str = strC + "人气值";
        } else {
            str = strC + "心动";
        }
        this.f8547d.setText(str);
        this.f8549f.setValueText(x8u.c(bLiveSummary.audienceCount));
        this.f8550g.setValueText(x8u.c(bLiveSummary.newFollowCount));
        this.f8552i.setValueText(x8u.c(bLiveSummary.rewarderCount));
        this.f8553j.setValueText(x8u.c(bLiveSummary.chatMsgCount));
        this.f8551h.setValueText(x8u.c(bLiveSummary.newFanbaseCount));
        xdl0.M(this.f8558o, !TextUtils.isEmpty(bLiveSummary.riseDirection));
        this.f8559p.setText(bLiveSummary.riseDirection);
        BLiveOfficialShowSummary bLiveOfficialShowSummary = bLiveSummary.officialShowSummary;
        LinearLayout linearLayout = this.f8554k;
        if (bLiveOfficialShowSummary == null) {
            xdl0.M(linearLayout, false);
            return;
        }
        xdl0.M(linearLayout, true);
        this.f8555l.setValueText(x8u.c(bLiveSummary.officialShowSummary.audienceCount));
        this.f8556m.setValueText(x8u.c(bLiveSummary.officialShowSummary.newFollowCount));
        this.f8557n.setValueText(x8u.c(bLiveSummary.officialShowSummary.rewarderCount));
    }

    /* JADX INFO: renamed from: f */
    private void m10903f(User user) {
        this.f8546c.setText(user.name);
        hxs.t("context_livingAct", this.f8545b, ((Media) user.fp()).url, t100.d(80.0f));
        hxs.p("context_livingAct", this.f8544a, ((Media) user.fp()).url, 1, t100.d(20.0f));
    }

    /* JADX INFO: renamed from: C0 */
    public Context m10904C0() {
        return null;
    }

    /* JADX INFO: renamed from: d */
    public void m10906d(User user, BLiveSummary bLiveSummary) {
        m10903f(user);
        m10902c(bLiveSummary);
    }

    /* JADX INFO: renamed from: e */
    public void m10907e(final Act act, String str) {
        if (!TextUtils.isEmpty(str)) {
            act.dialog().F(str).u0(act.getString(R$string.f3465o2)).z0();
        }
        this.f8560q.setOnClickListener(new View.OnClickListener() { // from class: l.b8s
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                act.finish();
            }
        });
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f19552I0, viewGroup, false);
        this.f8544a = viewInflate.findViewById(g5c0.f10818D2);
        this.f8545b = viewInflate.findViewById(g5c0.f11204t);
        this.f8546c = viewInflate.findViewById(g5c0.f11122k);
        this.f8547d = (TextView) viewInflate.findViewById(g5c0.f11108i5);
        this.f8548e = (LiveEndDataItemView) viewInflate.findViewById(g5c0.f11094h1);
        this.f8549f = (LiveEndDataItemView) viewInflate.findViewById(g5c0.f10994W7);
        this.f8550g = (LiveEndDataItemView) viewInflate.findViewById(g5c0.f11097h4);
        this.f8551h = (LiveEndDataItemView) viewInflate.findViewById(g5c0.f11087g4);
        this.f8552i = (LiveEndDataItemView) viewInflate.findViewById(g5c0.f11209t4);
        this.f8553j = (LiveEndDataItemView) viewInflate.findViewById(g5c0.f10881K2);
        this.f8554k = (LinearLayout) viewInflate.findViewById(g5c0.f11218u4);
        this.f8555l = (LiveEndDataItemView) viewInflate.findViewById(g5c0.f11177q);
        this.f8556m = (LiveEndDataItemView) viewInflate.findViewById(g5c0.f11227v4);
        this.f8557n = (LiveEndDataItemView) viewInflate.findViewById(g5c0.f11183q5);
        this.f8558o = (LinearLayout) viewInflate.findViewById(g5c0.f10854H2);
        this.f8559p = (LiveMarqueeTextView) viewInflate.findViewById(g5c0.f10863I2);
        this.f8560q = viewInflate.findViewById(g5c0.f11250y0);
        this.f8548e.setTagText("直播时长");
        this.f8549f.setTagText("观看人数");
        this.f8550g.setTagText("新增粉丝");
        this.f8551h.setTagText("粉丝团新增");
        this.f8552i.setTagText("送礼人数");
        this.f8553j.setTagText("互动次数");
        this.f8555l.setTagText("观看人数");
        this.f8556m.setTagText("新增粉丝");
        this.f8557n.setTagText("送礼人数");
        return viewInflate;
    }

    public void destroy() {
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void m10908i1(z7s z7sVar) {
    }
}
