package com.p046p1.mobile.putong.feed.p060ui.moments;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.putong.data.LocalStatus;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.Video;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.R$string;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.p060ui.moments.MomentsInProfileViewLarge;
import com.tantanapp.common.utils.NullChecker;
import java.util.Date;
import java.util.List;
import p147v.VDraweeView;
import p147v.VFrame_Anim;
import p147v.VLinear;
import p147v.VProgressBar;
import p147v.VText;
import p149l.gs00;
import p149l.mqi0;
import p149l.qib0;
import p149l.t100;
import p149l.v1h;
import p149l.z1c0;

/* JADX INFO: loaded from: classes12.dex */
public class MomentsInProfileViewLarge extends VLinear implements View.OnLongClickListener {

    /* JADX INFO: renamed from: c */
    public VFrame_Anim f43956c;

    /* JADX INFO: renamed from: d */
    public VProgressBar f43957d;

    /* JADX INFO: renamed from: e */
    public ImageView f43958e;

    /* JADX INFO: renamed from: f */
    public VText f43959f;

    /* JADX INFO: renamed from: g */
    public VText f43960g;

    /* JADX INFO: renamed from: h */
    public LinearLayout f43961h;

    /* JADX INFO: renamed from: i */
    public FrameLayout f43962i;

    /* JADX INFO: renamed from: j */
    public VDraweeView f43963j;

    /* JADX INFO: renamed from: k */
    public VText f43964k;

    /* JADX INFO: renamed from: l */
    public Moment f43965l;

    public MomentsInProfileViewLarge(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: P */
    public static /* synthetic */ void m67005P(Moment moment, Dialog dialog, View view, int i, CharSequence charSequence) {
        if (i == 0) {
            FeedModule.f38854c.m60733j4(moment);
        } else if (1 == i) {
            FeedModule.f38854c.m60728h3(moment._id);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public /* synthetic */ void m67008V(Moment moment, View view) {
        m67013Y(m67011T(), moment);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public /* synthetic */ void m67009W(View view) {
        MomentsInProfileAct momentsInProfileActM67011T = m67011T();
        MomentsInProfileAct momentsInProfileActM67011T2 = m67011T();
        Moment moment = this.f43965l;
        momentsInProfileActM67011T.startActivity(MomentDetailAct.m66660V1(momentsInProfileActM67011T2, moment.f56011id, moment.owner, false, false));
    }

    /* JADX INFO: renamed from: S */
    public final void m67010S(View view) {
        gs00.m127776a(this, view);
    }

    /* JADX INFO: renamed from: T */
    public MomentsInProfileAct m67011T() {
        return (MomentsInProfileAct) getContext();
    }

    /* JADX INFO: renamed from: X */
    public void m67012X(final Moment moment, int i, Moment moment2, boolean z) {
        boolean z2;
        Media media;
        this.f43965l = moment;
        Picture picture = null;
        if (TEnum.equals(moment.status(), "normal")) {
            this.f43956c.setVisibility(4);
            setOnClickListener(null);
            z2 = true;
        } else {
            boolean zEquals = TEnum.equals(moment.status(), LocalStatus.sending);
            VFrame_Anim vFrame_Anim = this.f43956c;
            if (zEquals) {
                vFrame_Anim.setVisibility(0);
                this.f43956c.m223026G(this.f43957d);
                setOnClickListener(null);
            } else {
                vFrame_Anim.setVisibility(0);
                this.f43956c.m223026G(this.f43958e);
                setOnClickListener(new View.OnClickListener() { // from class: l.ds00
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f87711a.m67008V(moment, view);
                    }
                });
            }
            z2 = false;
        }
        if (NullChecker.m81303a(moment2)) {
            Date date = new Date((long) moment.createdTime);
            Date date2 = new Date((long) moment2.createdTime);
            z2 = z2 && (date.getYear() != date2.getYear() || date.getMonth() != date2.getMonth() || date.getDate() != date2.getDate());
            if (z2) {
                setPadding(0, t100.m186890d(16.0f), 0, z ? getResources().getDimensionPixelSize(z1c0.f201065b) : t100.m186890d(8.0f));
            } else {
                setPadding(0, 0, 0, z ? getResources().getDimensionPixelSize(z1c0.f201065b) : t100.m186890d(8.0f));
            }
        } else {
            setPadding(0, t100.m186890d(20.0f), 0, z ? getResources().getDimensionPixelSize(z1c0.f201065b) : t100.m186890d(8.0f));
        }
        VText vText = this.f43960g;
        if (z2) {
            vText.setText(mqi0.f135262n.format(Double.valueOf(moment.createdTime)));
            this.f43959f.setText(mqi0.f135263o.format(Double.valueOf(moment.createdTime)));
        } else {
            vText.setText("");
            this.f43959f.setText("");
        }
        int size = moment.media.size();
        List<Media> list = moment.media;
        if (size >= 2) {
            media = list.get(1);
        } else {
            media = !list.isEmpty() ? moment.media.get(0) : null;
        }
        if (media instanceof Video) {
            picture = ((Video) media).cover;
        } else if (media instanceof Picture) {
            picture = (Picture) media;
        }
        if (NullChecker.m81304b(picture)) {
            qib0.f154691G.m102341Q0(this.f43963j, picture.momentPictureSmall());
        } else {
            qib0.f154691G.m184725o(this.f43963j);
        }
        this.f43964k.setText(moment.value);
        this.f43961h.setOnClickListener(new View.OnClickListener() { // from class: l.es00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f92974a.m67009W(view);
            }
        });
        this.f43961h.setOnLongClickListener(this);
    }

    /* JADX INFO: renamed from: Y */
    public void m67013Y(Act act, final Moment moment) {
        act.dialog().m20536f0(new String[]{act.getString(R$string.f39108n), act.getString(R$string.f39052f)}).m20537g0(new Dialog.InterfaceC4311g() { // from class: l.fs00
            @Override // com.p046p1.mobile.android.app.Dialog.InterfaceC4311g
            /* JADX INFO: renamed from: a */
            public final void mo20569a(Dialog dialog, View view, int i, CharSequence charSequence) {
                MomentsInProfileViewLarge.m67005P(moment, dialog, view, i, charSequence);
            }
        }).m20568z0();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m67010S(this);
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        MomentsInProfileAct momentsInProfileActM67011T = m67011T();
        Moment moment = this.f43965l;
        v1h.m196632x0(momentsInProfileActM67011T, moment.owner, moment, null, null, null, false, true, false);
        return true;
    }

    public MomentsInProfileViewLarge(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MomentsInProfileViewLarge(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
