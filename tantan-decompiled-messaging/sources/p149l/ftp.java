package p149l;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p046p1.mobile.putong.data.UserMedal;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceFansMyJoin;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceMemberLb;
import com.p046p1.mobile.putong.live.base.data.BLiveVoicePlayModeAnchorItem;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.common.usercard.CommonMedalView;
import p147v.VCheckBox;
import p147v.VDraweeView;
import p147v.VImage;

/* JADX INFO: loaded from: classes5.dex */
public class ftp extends d1q<ViewGroup> implements z7m {

    /* JADX INFO: renamed from: a */
    public final xsp f99229a;

    /* JADX INFO: renamed from: b */
    public d30 f99230b;

    /* JADX INFO: renamed from: c */
    public isp f99231c;

    /* JADX INFO: renamed from: d */
    public BLiveVoiceFansMyJoin f99232d;

    /* JADX INFO: renamed from: e */
    public BLiveVoiceMemberLb f99233e;

    /* JADX INFO: renamed from: f */
    public BLiveVoicePlayModeAnchorItem f99234f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f99235g;

    /* JADX INFO: renamed from: h */
    public TextView f99236h;

    /* JADX INFO: renamed from: i */
    public VDraweeView f99237i;

    /* JADX INFO: renamed from: j */
    public TextView f99238j;

    /* JADX INFO: renamed from: k */
    public VImage f99239k;

    /* JADX INFO: renamed from: l */
    public CommonMedalView f99240l;

    /* JADX INFO: renamed from: m */
    public TextView f99241m;

    /* JADX INFO: renamed from: n */
    public View f99242n;

    /* JADX INFO: renamed from: o */
    public TextView f99243o;

    /* JADX INFO: renamed from: p */
    public VCheckBox f99244p;

    /* JADX INFO: renamed from: q */
    public TextView f99245q;

    /* JADX INFO: renamed from: r */
    public boolean f99246r = false;

    /* JADX INFO: renamed from: s */
    public boolean f99247s = false;

    public ftp(xsp xspVar, d30 d30Var, BLiveVoiceMemberLb bLiveVoiceMemberLb) {
        this.f99229a = xspVar;
        this.f99230b = d30Var;
        this.f99233e = bLiveVoiceMemberLb;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public /* synthetic */ void m123072O(View view) {
        VCheckBox vCheckBox = this.f99244p;
        vCheckBox.setChecked(!vCheckBox.isChecked());
        this.f99247s = this.f99244p.isChecked();
        d30 d30Var = this.f99230b;
        if (d30Var != null) {
            d30Var.call();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public /* synthetic */ void m123073P(View view) {
        m123079V(this.f99233e.userId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public /* synthetic */ void m123074Q(View view) {
        m123079V(this.f99234f.anchorId);
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m123075R(View view) {
        VCheckBox vCheckBox = this.f99244p;
        vCheckBox.setChecked(!vCheckBox.isChecked());
        this.f99247s = this.f99244p.isChecked();
        isp ispVar = this.f99231c;
        if (ispVar != null) {
            ispVar.m138085M0();
        }
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m123076S() {
        this.f99231c.m138083J0(this.f99229a);
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m123077T(BLiveVoiceFansMyJoin bLiveVoiceFansMyJoin, View view) {
        this.f99229a.m210825j4(this.f99245q.isSelected() ? bLiveVoiceFansMyJoin.anchorId : "0", new d30() { // from class: l.zsp
            @Override // p149l.d30
            public final void call() {
                this.f204621a.m123076S();
            }
        });
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
    public void mo70566u(ViewGroup viewGroup) {
        super.mo70566u(viewGroup);
        this.f99235g = (VDraweeView) viewGroup.findViewById(g5c0.f100787Q4);
        this.f99236h = (TextView) viewGroup.findViewById(g5c0.f100796R4);
        this.f99237i = (VDraweeView) viewGroup.findViewById(g5c0.f101054t);
        this.f99238j = (TextView) viewGroup.findViewById(g5c0.f100917e4);
        this.f99239k = (VImage) viewGroup.findViewById(g5c0.f100847X1);
        this.f99240l = (CommonMedalView) viewGroup.findViewById(g5c0.f100822U3);
        this.f99241m = (TextView) viewGroup.findViewById(g5c0.f100849X3);
        this.f99243o = (TextView) viewGroup.findViewById(g5c0.f101060t5);
        this.f99242n = viewGroup.findViewById(g5c0.f101069u5);
        this.f99245q = (TextView) viewGroup.findViewById(g5c0.f100836W);
        VCheckBox vCheckBox = (VCheckBox) viewGroup.findViewById(g5c0.f101019p0);
        this.f99244p = vCheckBox;
        vCheckBox.setChecked(this.f99247s);
        BLiveVoiceMemberLb bLiveVoiceMemberLb = this.f99233e;
        if (bLiveVoiceMemberLb != null) {
            m123081X(bLiveVoiceMemberLb);
            if (this.f99246r) {
                xdl0.m208329E0(viewGroup, new View.OnClickListener() { // from class: l.atp
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f71649a.m123072O(view);
                    }
                });
            } else {
                xdl0.m208329E0(viewGroup, new View.OnClickListener() { // from class: l.btp
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f77253a.m123073P(view);
                    }
                });
            }
        }
        BLiveVoicePlayModeAnchorItem bLiveVoicePlayModeAnchorItem = this.f99234f;
        if (bLiveVoicePlayModeAnchorItem != null) {
            m123080W(bLiveVoicePlayModeAnchorItem);
            xdl0.m208329E0(viewGroup, new View.OnClickListener() { // from class: l.ctp
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f82496a.m123074Q(view);
                }
            });
        }
        BLiveVoiceFansMyJoin bLiveVoiceFansMyJoin = this.f99232d;
        if (bLiveVoiceFansMyJoin != null) {
            m123082Y(bLiveVoiceFansMyJoin);
            if (this.f99246r) {
                xdl0.m208329E0(viewGroup, new View.OnClickListener() { // from class: l.dtp
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f87866a.m123075R(view);
                    }
                });
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: V */
    public void m123079V(String str) {
        xsp xspVar = this.f99229a;
        u4n0.m191752k(xspVar, ((nnn0) xspVar.m206027E2()).m132140j0(), str);
    }

    /* JADX INFO: renamed from: W */
    public final void m123080W(BLiveVoicePlayModeAnchorItem bLiveVoicePlayModeAnchorItem) {
        xdl0.m208344M(this.f99235g, false);
        xdl0.m208344M(this.f99236h, false);
        xdl0.m208344M(this.f99241m, true);
        long j = bLiveVoicePlayModeAnchorItem.rank;
        if (j == 1) {
            hxs.m133407t("context_livingAct", this.f99235g, "https://auto.tancdn.com/v1/images/eyJpZCI6IlpENVdKM0IzWEFXSEZDSktVNk1XQTdRREhYMkUzMjE0IiwidyI6NjYsImgiOjY2LCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6NjE4NDgzNjk0MTI0OTgxMjE3Mn0.png", t100.m186890d(24.0f));
            xdl0.m208344M(this.f99235g, true);
        } else if (j == 2) {
            hxs.m133407t("context_livingAct", this.f99235g, "https://auto.tancdn.com/v1/images/eyJpZCI6IlpCMlo2UjM3M0ZPQ1VJT1BNUElaR1ZaVjdaV0tIWDE0IiwidyI6NjYsImgiOjY2LCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MTA4MzI2ODAzNjI5MjE1NDU3NDN9.png", t100.m186890d(24.0f));
            xdl0.m208344M(this.f99235g, true);
        } else if (j == 3) {
            hxs.m133407t("context_livingAct", this.f99235g, "https://auto.tancdn.com/v1/images/eyJpZCI6IlNBWEZUMlhBSDdZUDZaNUlXVTJHTU1BS1lJSk0yUDE0IiwidyI6NjYsImgiOjY2LCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6NjE4NDgxOTg1OTc2MDkyMTI4NH0.png", t100.m186890d(24.0f));
            xdl0.m208344M(this.f99235g, true);
        } else {
            this.f99236h.setText("" + bLiveVoicePlayModeAnchorItem.rank);
            xdl0.m208344M(this.f99236h, true);
        }
        hxs.m133407t("context_livingAct", this.f99237i, bLiveVoicePlayModeAnchorItem.anchorAvatar, t100.f167230E);
        this.f99238j.setText(bLiveVoicePlayModeAnchorItem.anchorName);
        boolean zEquals = TextUtils.equals(bLiveVoicePlayModeAnchorItem.gender, "female");
        VImage vImage = this.f99239k;
        if (zEquals) {
            vImage.setBackgroundResource(i3c0.f111037i3);
        } else {
            vImage.setBackgroundResource(i3c0.f111049j3);
        }
        this.f99241m.setText(w8u.m202218u(R$string.f46983Tg, Long.valueOf(bLiveVoicePlayModeAnchorItem.memberNum)));
        this.f99243o.setText(x8u.m207433c(bLiveVoicePlayModeAnchorItem.score));
        xdl0.m208344M(this.f99242n, !this.f99246r);
        xdl0.m208344M(this.f99244p, this.f99246r);
        xdl0.m208344M(this.f99245q, false);
    }

    /* JADX INFO: renamed from: X */
    public final void m123081X(BLiveVoiceMemberLb bLiveVoiceMemberLb) {
        xdl0.m208344M(this.f99235g, false);
        xdl0.m208344M(this.f99236h, false);
        xdl0.m208344M(this.f99241m, false);
        int i = bLiveVoiceMemberLb.rank;
        if (i == 1) {
            hxs.m133407t("context_livingAct", this.f99235g, "https://auto.tancdn.com/v1/images/eyJpZCI6IlpENVdKM0IzWEFXSEZDSktVNk1XQTdRREhYMkUzMjE0IiwidyI6NjYsImgiOjY2LCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6NjE4NDgzNjk0MTI0OTgxMjE3Mn0.png", t100.m186890d(24.0f));
            xdl0.m208344M(this.f99235g, true);
        } else if (i == 2) {
            hxs.m133407t("context_livingAct", this.f99235g, "https://auto.tancdn.com/v1/images/eyJpZCI6IlpCMlo2UjM3M0ZPQ1VJT1BNUElaR1ZaVjdaV0tIWDE0IiwidyI6NjYsImgiOjY2LCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MTA4MzI2ODAzNjI5MjE1NDU3NDN9.png", t100.m186890d(24.0f));
            xdl0.m208344M(this.f99235g, true);
        } else if (i == 3) {
            hxs.m133407t("context_livingAct", this.f99235g, "https://auto.tancdn.com/v1/images/eyJpZCI6IlNBWEZUMlhBSDdZUDZaNUlXVTJHTU1BS1lJSk0yUDE0IiwidyI6NjYsImgiOjY2LCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6NjE4NDgxOTg1OTc2MDkyMTI4NH0.png", t100.m186890d(24.0f));
            xdl0.m208344M(this.f99235g, true);
        } else {
            this.f99236h.setText("" + bLiveVoiceMemberLb.rank);
            xdl0.m208344M(this.f99236h, true);
        }
        hxs.m133407t("context_livingAct", this.f99237i, bLiveVoiceMemberLb.userAvatar, t100.f167230E);
        this.f99238j.setText(bLiveVoiceMemberLb.userName);
        boolean zEquals = TextUtils.equals(bLiveVoiceMemberLb.gender, "female");
        VImage vImage = this.f99239k;
        if (zEquals) {
            vImage.setBackgroundResource(i3c0.f111037i3);
        } else {
            vImage.setBackgroundResource(i3c0.f111049j3);
        }
        wtn0 wtn0Var = new wtn0(false);
        wtn0Var.m205573t(this.f99229a);
        UserMedal userMedal = new UserMedal();
        userMedal.voiceFanbaseColor = bLiveVoiceMemberLb.medalColor;
        userMedal.voiceFanbaseGrade = bLiveVoiceMemberLb.medalGrade;
        userMedal.voiceFanbaseText = bLiveVoiceMemberLb.medalName;
        wtn0Var.m205571r(this.f99240l, userMedal);
        this.f99243o.setText(x8u.m207433c(bLiveVoiceMemberLb.score));
        xdl0.m208344M(this.f99242n, !this.f99246r);
        xdl0.m208344M(this.f99244p, this.f99246r);
        xdl0.m208344M(this.f99245q, false);
    }

    /* JADX INFO: renamed from: Y */
    public final void m123082Y(final BLiveVoiceFansMyJoin bLiveVoiceFansMyJoin) {
        xdl0.m208344M(this.f99235g, false);
        xdl0.m208344M(this.f99236h, false);
        xdl0.m208344M(this.f99239k, false);
        xdl0.m208344M(this.f99241m, false);
        hxs.m133407t("context_livingAct", this.f99237i, bLiveVoiceFansMyJoin.anchorAvatar, t100.f167230E);
        this.f99238j.setText(bLiveVoiceFansMyJoin.anchorName);
        wtn0 wtn0Var = new wtn0(false);
        wtn0Var.m205573t(this.f99229a);
        UserMedal userMedal = new UserMedal();
        userMedal.voiceFanbaseColor = bLiveVoiceFansMyJoin.anchorAvatar;
        userMedal.voiceFanbaseGrade = bLiveVoiceFansMyJoin.medalGrade;
        userMedal.voiceFanbaseText = bLiveVoiceFansMyJoin.medalName;
        wtn0Var.m205571r(this.f99240l, userMedal);
        boolean z = bLiveVoiceFansMyJoin.equipped;
        TextView textView = this.f99245q;
        if (z) {
            textView.setText(R$string.f46857Ng);
            this.f99245q.setSelected(false);
        } else {
            textView.setText(R$string.f46771Jg);
            this.f99245q.setSelected(true);
        }
        xdl0.m208329E0(this.f99245q, new View.OnClickListener() { // from class: l.etp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f93165a.m123077T(bLiveVoiceFansMyJoin, view);
            }
        });
        xdl0.m208344M(this.f99245q, !this.f99246r);
        xdl0.m208344M(this.f99244p, this.f99246r);
        xdl0.m208344M(this.f99242n, false);
    }

    @Override // p149l.z7m
    public String getUserId() {
        BLiveVoiceMemberLb bLiveVoiceMemberLb = this.f99233e;
        if (bLiveVoiceMemberLb != null) {
            return bLiveVoiceMemberLb.userId;
        }
        BLiveVoiceFansMyJoin bLiveVoiceFansMyJoin = this.f99232d;
        return bLiveVoiceFansMyJoin != null ? bLiveVoiceFansMyJoin.anchorId : "";
    }

    @Override // p149l.z7m
    /* JADX INFO: renamed from: i */
    public void mo108449i(boolean z) {
        this.f99246r = z;
        VCheckBox vCheckBox = this.f99244p;
        if (vCheckBox != null) {
            vCheckBox.setChecked(false);
        }
        this.f99247s = false;
    }

    @Override // p149l.z7m
    public boolean isChecked() {
        return this.f99247s;
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: o */
    public int mo70565o() {
        return t6c0.f168094L2;
    }

    public ftp(xsp xspVar, BLiveVoicePlayModeAnchorItem bLiveVoicePlayModeAnchorItem) {
        this.f99229a = xspVar;
        this.f99234f = bLiveVoicePlayModeAnchorItem;
    }

    public ftp(xsp xspVar, isp ispVar, BLiveVoiceFansMyJoin bLiveVoiceFansMyJoin) {
        this.f99229a = xspVar;
        this.f99231c = ispVar;
        this.f99232d = bLiveVoiceFansMyJoin;
    }
}
