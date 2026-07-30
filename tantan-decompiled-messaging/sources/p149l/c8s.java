package p149l;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.data.BLiveOfficialShowSummary;
import com.p046p1.mobile.putong.live.base.data.BLiveSummary;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.operation.view.multiple.LiveMarqueeTextView;
import com.p046p1.mobile.putong.live.livingroom.other.liveend.LiveEndDataItemView;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class c8s implements s7m<z7s> {

    /* JADX INFO: renamed from: a */
    public VDraweeView f79794a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f79795b;

    /* JADX INFO: renamed from: c */
    public VText f79796c;

    /* JADX INFO: renamed from: d */
    public TextView f79797d;

    /* JADX INFO: renamed from: e */
    public LiveEndDataItemView f79798e;

    /* JADX INFO: renamed from: f */
    public LiveEndDataItemView f79799f;

    /* JADX INFO: renamed from: g */
    public LiveEndDataItemView f79800g;

    /* JADX INFO: renamed from: h */
    public LiveEndDataItemView f79801h;

    /* JADX INFO: renamed from: i */
    public LiveEndDataItemView f79802i;

    /* JADX INFO: renamed from: j */
    public LiveEndDataItemView f79803j;

    /* JADX INFO: renamed from: k */
    public LinearLayout f79804k;

    /* JADX INFO: renamed from: l */
    public LiveEndDataItemView f79805l;

    /* JADX INFO: renamed from: m */
    public LiveEndDataItemView f79806m;

    /* JADX INFO: renamed from: n */
    public LiveEndDataItemView f79807n;

    /* JADX INFO: renamed from: o */
    public LinearLayout f79808o;

    /* JADX INFO: renamed from: p */
    public LiveMarqueeTextView f79809p;

    /* JADX INFO: renamed from: q */
    public VImage f79810q;

    /* JADX INFO: renamed from: c */
    private void m105813c(BLiveSummary bLiveSummary) {
        String str;
        this.f79798e.setValueText(jbu.m140815W(bLiveSummary.duration * 1000));
        String strM207433c = x8u.m207433c(bLiveSummary.rewardPoint);
        if (uvr.m196087d().m162715s0()) {
            str = strM207433c + "人气值";
        } else {
            str = strM207433c + "心动";
        }
        this.f79797d.setText(str);
        this.f79799f.setValueText(x8u.m207433c(bLiveSummary.audienceCount));
        this.f79800g.setValueText(x8u.m207433c(bLiveSummary.newFollowCount));
        this.f79802i.setValueText(x8u.m207433c(bLiveSummary.rewarderCount));
        this.f79803j.setValueText(x8u.m207433c(bLiveSummary.chatMsgCount));
        this.f79801h.setValueText(x8u.m207433c(bLiveSummary.newFanbaseCount));
        xdl0.m208344M(this.f79808o, !TextUtils.isEmpty(bLiveSummary.riseDirection));
        this.f79809p.setText(bLiveSummary.riseDirection);
        BLiveOfficialShowSummary bLiveOfficialShowSummary = bLiveSummary.officialShowSummary;
        LinearLayout linearLayout = this.f79804k;
        if (bLiveOfficialShowSummary == null) {
            xdl0.m208344M(linearLayout, false);
            return;
        }
        xdl0.m208344M(linearLayout, true);
        this.f79805l.setValueText(x8u.m207433c(bLiveSummary.officialShowSummary.audienceCount));
        this.f79806m.setValueText(x8u.m207433c(bLiveSummary.officialShowSummary.newFollowCount));
        this.f79807n.setValueText(x8u.m207433c(bLiveSummary.officialShowSummary.rewarderCount));
    }

    /* JADX INFO: renamed from: f */
    private void m105814f(User user) {
        this.f79796c.setText(user.name);
        hxs.m133407t("context_livingAct", this.f79795b, user.m60124fp().url, t100.m186890d(80.0f));
        hxs.m133403p("context_livingAct", this.f79794a, user.m60124fp().url, 1, t100.m186890d(20.0f));
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    /* JADX INFO: renamed from: d */
    public void m105816d(User user, BLiveSummary bLiveSummary) {
        m105814f(user);
        m105813c(bLiveSummary);
    }

    /* JADX INFO: renamed from: e */
    public void m105817e(final Act act, String str) {
        if (!TextUtils.isEmpty(str)) {
            act.dialog().m20504F(str).m20558u0(act.getString(R$string.f47423o2)).m20568z0();
        }
        this.f79810q.setOnClickListener(new View.OnClickListener() { // from class: l.b8s
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                act.m66873d2();
            }
        });
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f168056I0, viewGroup, false);
        this.f79794a = (VDraweeView) viewInflate.findViewById(g5c0.f100668D2);
        this.f79795b = (VDraweeView) viewInflate.findViewById(g5c0.f101054t);
        this.f79796c = (VText) viewInflate.findViewById(g5c0.f100972k);
        this.f79797d = (TextView) viewInflate.findViewById(g5c0.f100958i5);
        this.f79798e = (LiveEndDataItemView) viewInflate.findViewById(g5c0.f100944h1);
        this.f79799f = (LiveEndDataItemView) viewInflate.findViewById(g5c0.f100844W7);
        this.f79800g = (LiveEndDataItemView) viewInflate.findViewById(g5c0.f100947h4);
        this.f79801h = (LiveEndDataItemView) viewInflate.findViewById(g5c0.f100937g4);
        this.f79802i = (LiveEndDataItemView) viewInflate.findViewById(g5c0.f101059t4);
        this.f79803j = (LiveEndDataItemView) viewInflate.findViewById(g5c0.f100731K2);
        this.f79804k = (LinearLayout) viewInflate.findViewById(g5c0.f101068u4);
        this.f79805l = (LiveEndDataItemView) viewInflate.findViewById(g5c0.f101027q);
        this.f79806m = (LiveEndDataItemView) viewInflate.findViewById(g5c0.f101077v4);
        this.f79807n = (LiveEndDataItemView) viewInflate.findViewById(g5c0.f101033q5);
        this.f79808o = (LinearLayout) viewInflate.findViewById(g5c0.f100704H2);
        this.f79809p = (LiveMarqueeTextView) viewInflate.findViewById(g5c0.f100713I2);
        this.f79810q = (VImage) viewInflate.findViewById(g5c0.f101100y0);
        this.f79798e.setTagText("直播时长");
        this.f79799f.setTagText("观看人数");
        this.f79800g.setTagText("新增粉丝");
        this.f79801h.setTagText("粉丝团新增");
        this.f79802i.setTagText("送礼人数");
        this.f79803j.setTagText("互动次数");
        this.f79805l.setTagText("观看人数");
        this.f79806m.setTagText("新增粉丝");
        this.f79807n.setTagText("送礼人数");
        return viewInflate;
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(z7s z7sVar) {
    }
}
