package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p046p1.mobile.putong.data.UserMedal;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceFanBaseDetail;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceFanBaseRight;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.common.usercard.CommonMedalView;
import java.util.ArrayList;
import p147v.VDraweeView;

/* JADX INFO: loaded from: classes5.dex */
public class irp extends byr {

    /* JADX INFO: renamed from: A */
    public TextView f114662A;

    /* JADX INFO: renamed from: B */
    public TextView f114663B;

    /* JADX INFO: renamed from: C */
    public View f114664C;

    /* JADX INFO: renamed from: D */
    public TextView f114665D;

    /* JADX INFO: renamed from: E */
    public ArrayList<VDraweeView> f114666E;

    /* JADX INFO: renamed from: F */
    public ArrayList<TextView> f114667F;

    /* JADX INFO: renamed from: x */
    public CommonMedalView f114668x;

    /* JADX INFO: renamed from: y */
    public VDraweeView f114669y;

    /* JADX INFO: renamed from: z */
    public VDraweeView f114670z;

    public irp(xsp xspVar) {
        super(xspVar, LayoutInflater.from(xspVar.act()).inflate(t6c0.f168034G2, (ViewGroup) null));
        this.f114666E = new ArrayList<>();
        this.f114667F = new ArrayList<>();
        xdl0.m208329E0(m71760R().findViewById(g5c0.f101002n1), new View.OnClickListener() { // from class: l.hrp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f109236a.m137909o0(view);
            }
        });
        VDraweeView vDraweeView = (VDraweeView) m71760R().findViewById(g5c0.f100674E);
        this.f114669y = vDraweeView;
        mep0.m154301c1(vDraweeView, 0, 0, 0, -t100.m186890d(24.0f), t100.m186890d(24.0f));
        this.f114670z = (VDraweeView) m71760R().findViewById(g5c0.f101054t);
        this.f114662A = (TextView) m71760R().findViewById(g5c0.f100808S7);
        this.f114668x = (CommonMedalView) m71760R().findViewById(g5c0.f100822U3);
        this.f114663B = (TextView) m71760R().findViewById(g5c0.f100840W3);
        this.f114666E.add((VDraweeView) m71760R().findViewById(g5c0.f100968j5));
        this.f114666E.add((VDraweeView) m71760R().findViewById(g5c0.f100978k5));
        this.f114666E.add((VDraweeView) m71760R().findViewById(g5c0.f100988l5));
        this.f114667F.add((TextView) m71760R().findViewById(g5c0.f101006n5));
        this.f114667F.add((TextView) m71760R().findViewById(g5c0.f101015o5));
        this.f114667F.add((TextView) m71760R().findViewById(g5c0.f101024p5));
        this.f114664C = m71760R().findViewById(g5c0.f100782Q);
        this.f114665D = (TextView) m71760R().findViewById(g5c0.f100791R);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ void m137909o0(View view) {
        dismiss();
    }

    /* JADX INFO: renamed from: p0 */
    public void m137910p0(final xsp xspVar, final BLiveVoiceFanBaseDetail bLiveVoiceFanBaseDetail) {
        hxs.m133408u("context_livingAct", this.f114669y, "https://auto.tancdn.com/v1/images/eyJpZCI6IkxKQjZJR0dETFM0UEsyQlRCMjdGR080RkhYNEFMTjE0IiwidyI6MTEyNSwiaCI6MTI4NywiZCI6MCwibXQiOiJpbWFnZS9qcGVnIiwiZGgiOjg2NjI2NzM4ODMyNzI0MjM2MTV9.png", xdl0.m208412y0(), t100.m186890d(580.0f));
        hxs.m133407t("context_livingAct", this.f114670z, bLiveVoiceFanBaseDetail.avatar, t100.f167236K);
        wtn0 wtn0Var = new wtn0(false);
        wtn0Var.m205573t(xspVar);
        UserMedal userMedal = new UserMedal();
        userMedal.voiceFanbaseColor = bLiveVoiceFanBaseDetail.medalColor;
        userMedal.voiceFanbaseGrade = bLiveVoiceFanBaseDetail.medalGrade;
        userMedal.voiceFanbaseText = bLiveVoiceFanBaseDetail.medalName;
        wtn0Var.m205571r(this.f114668x, userMedal);
        this.f114662A.setText(bLiveVoiceFanBaseDetail.name);
        this.f114663B.setText(w8u.m202218u(R$string.f46983Tg, Integer.valueOf(bLiveVoiceFanBaseDetail.memberNum)));
        int i = 0;
        while (i < 3) {
            VDraweeView vDraweeView = this.f114666E.get(i);
            TextView textView = this.f114667F.get(i);
            BLiveVoiceFanBaseRight bLiveVoiceFanBaseRight = bLiveVoiceFanBaseDetail.rights.size() > i ? bLiveVoiceFanBaseDetail.rights.get(i) : null;
            if (bLiveVoiceFanBaseRight == null) {
                xdl0.m208344M(vDraweeView, false);
                xdl0.m208344M(textView, false);
            } else {
                xdl0.m208344M(vDraweeView, true);
                xdl0.m208344M(textView, true);
                hxs.m133407t("context_livingAct", vDraweeView, bLiveVoiceFanBaseRight.pic, t100.f167234I);
                textView.setText(bLiveVoiceFanBaseRight.name);
            }
            i++;
        }
        this.f114665D.setText(kvc0.m147355d(R$string.f46920Qg) + kvc0.m147355d(R$string.f47004Ug));
        xdl0.m208329E0(this.f114664C, new View.OnClickListener() { // from class: l.grp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                xsp xspVar2 = xspVar;
                BLiveVoiceFanBaseDetail bLiveVoiceFanBaseDetail2 = bLiveVoiceFanBaseDetail;
                xspVar2.m210822g4(bLiveVoiceFanBaseDetail2, bLiveVoiceFanBaseDetail2.joinGiftId);
            }
        });
    }
}
