package p153l;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.putong.data.UserMedal;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceFansMyJoin;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceMemberLb;
import com.p051p1.mobile.putong.live.base.data.BLiveVoicePlayModeAnchorItem;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.common.usercard.CommonMedalView;
import p151v.VCheckBox;
import p151v.VDraweeView;
import p151v.VImage;

/* JADX INFO: loaded from: classes5.dex */
public class fvp extends d3q<ViewGroup> implements pam {

    /* JADX INFO: renamed from: a */
    public final xup f101055a;

    /* JADX INFO: renamed from: b */
    public x20 f101056b;

    /* JADX INFO: renamed from: c */
    public iup f101057c;

    /* JADX INFO: renamed from: d */
    public BLiveVoiceFansMyJoin f101058d;

    /* JADX INFO: renamed from: e */
    public BLiveVoiceMemberLb f101059e;

    /* JADX INFO: renamed from: f */
    public BLiveVoicePlayModeAnchorItem f101060f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f101061g;

    /* JADX INFO: renamed from: h */
    public TextView f101062h;

    /* JADX INFO: renamed from: i */
    public VDraweeView f101063i;

    /* JADX INFO: renamed from: j */
    public TextView f101064j;

    /* JADX INFO: renamed from: k */
    public VImage f101065k;

    /* JADX INFO: renamed from: l */
    public CommonMedalView f101066l;

    /* JADX INFO: renamed from: m */
    public TextView f101067m;

    /* JADX INFO: renamed from: n */
    public View f101068n;

    /* JADX INFO: renamed from: o */
    public TextView f101069o;

    /* JADX INFO: renamed from: p */
    public VCheckBox f101070p;

    /* JADX INFO: renamed from: q */
    public TextView f101071q;

    /* JADX INFO: renamed from: r */
    public boolean f101072r = false;

    /* JADX INFO: renamed from: s */
    public boolean f101073s = false;

    public fvp(xup xupVar, x20 x20Var, BLiveVoiceMemberLb bLiveVoiceMemberLb) {
        this.f101055a = xupVar;
        this.f101056b = x20Var;
        this.f101059e = bLiveVoiceMemberLb;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public /* synthetic */ void m127685O(View view) {
        VCheckBox vCheckBox = this.f101070p;
        vCheckBox.setChecked(!vCheckBox.isChecked());
        this.f101073s = this.f101070p.isChecked();
        x20 x20Var = this.f101056b;
        if (x20Var != null) {
            x20Var.call();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public /* synthetic */ void m127686P(View view) {
        m127692V(this.f101059e.userId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public /* synthetic */ void m127687Q(View view) {
        m127692V(this.f101060f.anchorId);
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m127688R(View view) {
        VCheckBox vCheckBox = this.f101070p;
        vCheckBox.setChecked(!vCheckBox.isChecked());
        this.f101073s = this.f101070p.isChecked();
        iup iupVar = this.f101057c;
        if (iupVar != null) {
            iupVar.m142231M0();
        }
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m127689S() {
        this.f101057c.m142229J0(this.f101055a);
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m127690T(BLiveVoiceFansMyJoin bLiveVoiceFansMyJoin, View view) {
        this.f101055a.m213178j4(this.f101071q.isSelected() ? bLiveVoiceFansMyJoin.anchorId : "0", new x20() { // from class: l.zup
            @Override // p153l.x20
            public final void call() {
                this.f206145a.m127689S();
            }
        });
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
    public void mo71749u(ViewGroup viewGroup) {
        super.mo71749u(viewGroup);
        this.f101061g = (VDraweeView) viewGroup.findViewById(mdc0.f136032Q4);
        this.f101062h = (TextView) viewGroup.findViewById(mdc0.f136041R4);
        this.f101063i = (VDraweeView) viewGroup.findViewById(mdc0.f136299t);
        this.f101064j = (TextView) viewGroup.findViewById(mdc0.f136162e4);
        this.f101065k = (VImage) viewGroup.findViewById(mdc0.f136092X1);
        this.f101066l = (CommonMedalView) viewGroup.findViewById(mdc0.f136067U3);
        this.f101067m = (TextView) viewGroup.findViewById(mdc0.f136094X3);
        this.f101069o = (TextView) viewGroup.findViewById(mdc0.f136305t5);
        this.f101068n = viewGroup.findViewById(mdc0.f136314u5);
        this.f101071q = (TextView) viewGroup.findViewById(mdc0.f136081W);
        VCheckBox vCheckBox = (VCheckBox) viewGroup.findViewById(mdc0.f136264p0);
        this.f101070p = vCheckBox;
        vCheckBox.setChecked(this.f101073s);
        BLiveVoiceMemberLb bLiveVoiceMemberLb = this.f101059e;
        if (bLiveVoiceMemberLb != null) {
            m127694X(bLiveVoiceMemberLb);
            if (this.f101072r) {
                bnl0.m105509E0(viewGroup, new View.OnClickListener() { // from class: l.avp
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f73635a.m127685O(view);
                    }
                });
            } else {
                bnl0.m105509E0(viewGroup, new View.OnClickListener() { // from class: l.bvp
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f78615a.m127686P(view);
                    }
                });
            }
        }
        BLiveVoicePlayModeAnchorItem bLiveVoicePlayModeAnchorItem = this.f101060f;
        if (bLiveVoicePlayModeAnchorItem != null) {
            m127693W(bLiveVoicePlayModeAnchorItem);
            bnl0.m105509E0(viewGroup, new View.OnClickListener() { // from class: l.cvp
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f84022a.m127687Q(view);
                }
            });
        }
        BLiveVoiceFansMyJoin bLiveVoiceFansMyJoin = this.f101058d;
        if (bLiveVoiceFansMyJoin != null) {
            m127695Y(bLiveVoiceFansMyJoin);
            if (this.f101072r) {
                bnl0.m105509E0(viewGroup, new View.OnClickListener() { // from class: l.dvp
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f90937a.m127688R(view);
                    }
                });
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: V */
    public void m127692V(String str) {
        xup xupVar = this.f101055a;
        ydn0.m215258k(xupVar, ((rwn0) xupVar.m213810E2()).m168526j0(), str);
    }

    /* JADX INFO: renamed from: W */
    public final void m127693W(BLiveVoicePlayModeAnchorItem bLiveVoicePlayModeAnchorItem) {
        bnl0.m105524M(this.f101061g, false);
        bnl0.m105524M(this.f101062h, false);
        bnl0.m105524M(this.f101067m, true);
        long j = bLiveVoicePlayModeAnchorItem.rank;
        if (j == 1) {
            izs.m142869t("context_livingAct", this.f101061g, "https://auto.tancdn.com/v1/images/eyJpZCI6IlpENVdKM0IzWEFXSEZDSktVNk1XQTdRREhYMkUzMjE0IiwidyI6NjYsImgiOjY2LCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6NjE4NDgzNjk0MTI0OTgxMjE3Mn0.png", qa00.m175859d(24.0f));
            bnl0.m105524M(this.f101061g, true);
        } else if (j == 2) {
            izs.m142869t("context_livingAct", this.f101061g, "https://auto.tancdn.com/v1/images/eyJpZCI6IlpCMlo2UjM3M0ZPQ1VJT1BNUElaR1ZaVjdaV0tIWDE0IiwidyI6NjYsImgiOjY2LCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MTA4MzI2ODAzNjI5MjE1NDU3NDN9.png", qa00.m175859d(24.0f));
            bnl0.m105524M(this.f101061g, true);
        } else if (j == 3) {
            izs.m142869t("context_livingAct", this.f101061g, "https://auto.tancdn.com/v1/images/eyJpZCI6IlNBWEZUMlhBSDdZUDZaNUlXVTJHTU1BS1lJSk0yUDE0IiwidyI6NjYsImgiOjY2LCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6NjE4NDgxOTg1OTc2MDkyMTI4NH0.png", qa00.m175859d(24.0f));
            bnl0.m105524M(this.f101061g, true);
        } else {
            this.f101062h.setText("" + bLiveVoicePlayModeAnchorItem.rank);
            bnl0.m105524M(this.f101062h, true);
        }
        izs.m142869t("context_livingAct", this.f101063i, bLiveVoicePlayModeAnchorItem.anchorAvatar, qa00.f156292E);
        this.f101064j.setText(bLiveVoicePlayModeAnchorItem.anchorName);
        boolean zEquals = TextUtils.equals(bLiveVoicePlayModeAnchorItem.gender, "female");
        VImage vImage = this.f101065k;
        if (zEquals) {
            vImage.setBackgroundResource(obc0.f146365i3);
        } else {
            vImage.setBackgroundResource(obc0.f146377j3);
        }
        this.f101067m.setText(xau.m209911u(R$string.f47831Tg, Long.valueOf(bLiveVoicePlayModeAnchorItem.memberNum)));
        this.f101069o.setText(yau.m214935c(bLiveVoicePlayModeAnchorItem.score));
        bnl0.m105524M(this.f101068n, !this.f101072r);
        bnl0.m105524M(this.f101070p, this.f101072r);
        bnl0.m105524M(this.f101071q, false);
    }

    /* JADX INFO: renamed from: X */
    public final void m127694X(BLiveVoiceMemberLb bLiveVoiceMemberLb) {
        bnl0.m105524M(this.f101061g, false);
        bnl0.m105524M(this.f101062h, false);
        bnl0.m105524M(this.f101067m, false);
        int i = bLiveVoiceMemberLb.rank;
        if (i == 1) {
            izs.m142869t("context_livingAct", this.f101061g, "https://auto.tancdn.com/v1/images/eyJpZCI6IlpENVdKM0IzWEFXSEZDSktVNk1XQTdRREhYMkUzMjE0IiwidyI6NjYsImgiOjY2LCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6NjE4NDgzNjk0MTI0OTgxMjE3Mn0.png", qa00.m175859d(24.0f));
            bnl0.m105524M(this.f101061g, true);
        } else if (i == 2) {
            izs.m142869t("context_livingAct", this.f101061g, "https://auto.tancdn.com/v1/images/eyJpZCI6IlpCMlo2UjM3M0ZPQ1VJT1BNUElaR1ZaVjdaV0tIWDE0IiwidyI6NjYsImgiOjY2LCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MTA4MzI2ODAzNjI5MjE1NDU3NDN9.png", qa00.m175859d(24.0f));
            bnl0.m105524M(this.f101061g, true);
        } else if (i == 3) {
            izs.m142869t("context_livingAct", this.f101061g, "https://auto.tancdn.com/v1/images/eyJpZCI6IlNBWEZUMlhBSDdZUDZaNUlXVTJHTU1BS1lJSk0yUDE0IiwidyI6NjYsImgiOjY2LCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6NjE4NDgxOTg1OTc2MDkyMTI4NH0.png", qa00.m175859d(24.0f));
            bnl0.m105524M(this.f101061g, true);
        } else {
            this.f101062h.setText("" + bLiveVoiceMemberLb.rank);
            bnl0.m105524M(this.f101062h, true);
        }
        izs.m142869t("context_livingAct", this.f101063i, bLiveVoiceMemberLb.userAvatar, qa00.f156292E);
        this.f101064j.setText(bLiveVoiceMemberLb.userName);
        boolean zEquals = TextUtils.equals(bLiveVoiceMemberLb.gender, "female");
        VImage vImage = this.f101065k;
        if (zEquals) {
            vImage.setBackgroundResource(obc0.f146365i3);
        } else {
            vImage.setBackgroundResource(obc0.f146377j3);
        }
        a3o0 a3o0Var = new a3o0(false);
        a3o0Var.m95860t(this.f101055a);
        UserMedal userMedal = new UserMedal();
        userMedal.voiceFanbaseColor = bLiveVoiceMemberLb.medalColor;
        userMedal.voiceFanbaseGrade = bLiveVoiceMemberLb.medalGrade;
        userMedal.voiceFanbaseText = bLiveVoiceMemberLb.medalName;
        a3o0Var.m95858r(this.f101066l, userMedal);
        this.f101069o.setText(yau.m214935c(bLiveVoiceMemberLb.score));
        bnl0.m105524M(this.f101068n, !this.f101072r);
        bnl0.m105524M(this.f101070p, this.f101072r);
        bnl0.m105524M(this.f101071q, false);
    }

    /* JADX INFO: renamed from: Y */
    public final void m127695Y(final BLiveVoiceFansMyJoin bLiveVoiceFansMyJoin) {
        bnl0.m105524M(this.f101061g, false);
        bnl0.m105524M(this.f101062h, false);
        bnl0.m105524M(this.f101065k, false);
        bnl0.m105524M(this.f101067m, false);
        izs.m142869t("context_livingAct", this.f101063i, bLiveVoiceFansMyJoin.anchorAvatar, qa00.f156292E);
        this.f101064j.setText(bLiveVoiceFansMyJoin.anchorName);
        a3o0 a3o0Var = new a3o0(false);
        a3o0Var.m95860t(this.f101055a);
        UserMedal userMedal = new UserMedal();
        userMedal.voiceFanbaseColor = bLiveVoiceFansMyJoin.anchorAvatar;
        userMedal.voiceFanbaseGrade = bLiveVoiceFansMyJoin.medalGrade;
        userMedal.voiceFanbaseText = bLiveVoiceFansMyJoin.medalName;
        a3o0Var.m95858r(this.f101066l, userMedal);
        boolean z = bLiveVoiceFansMyJoin.equipped;
        TextView textView = this.f101071q;
        if (z) {
            textView.setText(R$string.f47705Ng);
            this.f101071q.setSelected(false);
        } else {
            textView.setText(R$string.f47619Jg);
            this.f101071q.setSelected(true);
        }
        bnl0.m105509E0(this.f101071q, new View.OnClickListener() { // from class: l.evp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f96017a.m127690T(bLiveVoiceFansMyJoin, view);
            }
        });
        bnl0.m105524M(this.f101071q, !this.f101072r);
        bnl0.m105524M(this.f101070p, this.f101072r);
        bnl0.m105524M(this.f101068n, false);
    }

    @Override // p153l.pam
    public String getUserId() {
        BLiveVoiceMemberLb bLiveVoiceMemberLb = this.f101059e;
        if (bLiveVoiceMemberLb != null) {
            return bLiveVoiceMemberLb.userId;
        }
        BLiveVoiceFansMyJoin bLiveVoiceFansMyJoin = this.f101058d;
        return bLiveVoiceFansMyJoin != null ? bLiveVoiceFansMyJoin.anchorId : "";
    }

    @Override // p153l.pam
    /* JADX INFO: renamed from: i */
    public void mo112536i(boolean z) {
        this.f101072r = z;
        VCheckBox vCheckBox = this.f101070p;
        if (vCheckBox != null) {
            vCheckBox.setChecked(false);
        }
        this.f101073s = false;
    }

    @Override // p153l.pam
    public boolean isChecked() {
        return this.f101073s;
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: o */
    public int mo71748o() {
        return yec0.f198826L2;
    }

    public fvp(xup xupVar, BLiveVoicePlayModeAnchorItem bLiveVoicePlayModeAnchorItem) {
        this.f101055a = xupVar;
        this.f101060f = bLiveVoicePlayModeAnchorItem;
    }

    public fvp(xup xupVar, iup iupVar, BLiveVoiceFansMyJoin bLiveVoiceFansMyJoin) {
        this.f101055a = xupVar;
        this.f101057c = iupVar;
        this.f101058d = bLiveVoiceFansMyJoin;
    }
}
