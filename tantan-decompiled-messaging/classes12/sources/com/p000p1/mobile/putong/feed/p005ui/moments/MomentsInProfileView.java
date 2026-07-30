package com.p000p1.mobile.putong.feed.p005ui.moments;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.p000p1.mobile.putong.data.LocalStatus;
import com.p000p1.mobile.putong.data.Media;
import com.p000p1.mobile.putong.data.Picture;
import com.p000p1.mobile.putong.data.Video;
import com.p000p1.mobile.putong.data.tenum.TEnum;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.R$string;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.p005ui.moments.MomentsInProfileView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.Dialog;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.Date;
import l.mqi0;
import l.qib0;
import l.t100;
import p007l.b5c0;
import p007l.f3c0;
import p007l.v1h;
import p007l.ws00;
import p007l.z1c0;
import v.VDraweeView;
import v.VFrame_Anim;
import v.VLinear;
import v.VProgressBar;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class MomentsInProfileView extends VLinear implements View.OnLongClickListener {

    /* JADX INFO: renamed from: c */
    public VFrame_Anim f5405c;

    /* JADX INFO: renamed from: d */
    public VProgressBar f5406d;

    /* JADX INFO: renamed from: e */
    public ImageView f5407e;

    /* JADX INFO: renamed from: f */
    public VText f5408f;

    /* JADX INFO: renamed from: g */
    public VText f5409g;

    /* JADX INFO: renamed from: h */
    public LinearLayout f5410h;

    /* JADX INFO: renamed from: i */
    public FrameLayout f5411i;

    /* JADX INFO: renamed from: j */
    public VText f5412j;

    /* JADX INFO: renamed from: k */
    public VText f5413k;

    /* JADX INFO: renamed from: l */
    public VDraweeView[] f5414l;

    /* JADX INFO: renamed from: m */
    public View f5415m;

    /* JADX INFO: renamed from: n */
    public Moment f5416n;

    public MomentsInProfileView(Context context) {
        super(context);
        this.f5414l = new VDraweeView[4];
    }

    /* JADX INFO: renamed from: P */
    public static /* synthetic */ void m8195P(Moment moment, Dialog dialog, View view, int i, CharSequence charSequence) {
        if (i == 0) {
            FeedModule.f315c.m1659j4(moment);
        } else if (1 == i) {
            FeedModule.f315c.m1654h3(((DbObject) moment)._id);
        }
    }

    /* JADX INFO: renamed from: T */
    public final void m8199T(View view) {
        ws00.m15918a(this, view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: V */
    public MomentsInProfileAct m8200V() {
        return (MomentsInProfileAct) getContext();
    }

    /* JADX INFO: renamed from: W */
    public void m8201W(int i) {
        View viewInflate = m8200V().inflater().inflate(i, (ViewGroup) this.f5411i, false);
        this.f5414l[0] = (VDraweeView) viewInflate.findViewById(b5c0.f6076o0);
        this.f5414l[1] = (VDraweeView) viewInflate.findViewById(b5c0.f6082q0);
        this.f5414l[2] = (VDraweeView) viewInflate.findViewById(b5c0.f6079p0);
        this.f5414l[3] = (VDraweeView) viewInflate.findViewById(b5c0.f6073n0);
        this.f5415m = viewInflate.findViewById(b5c0.f6083q1);
        this.f5411i.addView(viewInflate, 0);
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m8202X(Moment moment, View view) {
        m8206b0(m8200V(), moment);
    }

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ void m8203Y(Moment moment, View view) {
        m8200V().startActivity(MomentsInProfileTextAct.m8194V1(m8200V(), ((DbObject) moment).id, moment.owner));
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ void m8204Z(Moment moment, View view) {
        m8200V().startActivity(MomentsInProfilePreviewAct.m8117I2(m8200V(), ((DbObject) moment).id, moment.owner));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a0 */
    public void m8205a0(final Moment moment, int i, Moment moment2, boolean z) {
        boolean z2;
        this.f5416n = moment;
        if (TEnum.equals(moment.status(), "normal")) {
            this.f5405c.setVisibility(4);
            setOnClickListener((View.OnClickListener) null);
            z2 = true;
        } else {
            boolean zEquals = TEnum.equals(moment.status(), LocalStatus.sending);
            VFrame_Anim vFrame_Anim = this.f5405c;
            if (zEquals) {
                vFrame_Anim.setVisibility(0);
                this.f5405c.G(this.f5406d);
                setOnClickListener((View.OnClickListener) null);
            } else {
                vFrame_Anim.setVisibility(0);
                this.f5405c.G(this.f5407e);
                setOnClickListener(new View.OnClickListener() { // from class: l.zr00
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f15841a.m8202X(moment, view);
                    }
                });
            }
            z2 = false;
        }
        if (NullChecker.a(moment2)) {
            Date date = new Date((long) moment.createdTime);
            Date date2 = new Date((long) moment2.createdTime);
            boolean z3 = z2 && (date.getYear() != date2.getYear() || date.getMonth() != date2.getMonth() || date.getDate() != date2.getDate());
            if (z3) {
                setPadding(0, t100.d(16.0f), 0, z ? getResources().getDimensionPixelSize(z1c0.f15554b) : t100.d(8.0f));
            } else {
                setPadding(0, 0, 0, z ? getResources().getDimensionPixelSize(z1c0.f15554b) : t100.d(8.0f));
            }
            z2 = z3;
        } else {
            setPadding(0, t100.d(20.0f), 0, z ? getResources().getDimensionPixelSize(z1c0.f15554b) : t100.d(8.0f));
        }
        VText vText = this.f5409g;
        if (z2) {
            vText.setText(mqi0.n.format(Double.valueOf(moment.createdTime)));
            this.f5408f.setText(mqi0.o.format(Double.valueOf(moment.createdTime)));
        } else {
            vText.setText("");
            this.f5408f.setText("");
        }
        for (int i2 = 0; i2 < i; i2++) {
            Media media = moment.media.get(i2);
            Picture picture = media instanceof Video ? ((Video) media).cover : media instanceof Picture ? (Picture) media : null;
            if (NullChecker.a(picture)) {
                qib0.G.Q0(this.f5414l[i2], picture.momentPictureSmall());
            } else {
                qib0.G.o(this.f5414l[i2]);
            }
        }
        this.f5412j.setText(moment.value);
        LinearLayout linearLayout = this.f5410h;
        if (i == 0) {
            linearLayout.setOnClickListener(null);
            this.f5410h.setClickable(false);
            this.f5411i.setVisibility(8);
            this.f5412j.setMaxLines(3);
            this.f5412j.setBackgroundDrawable(getResources().getDrawable(f3c0.f7866n6));
            this.f5412j.setPadding(t100.d(16.0f), t100.d(12.0f), t100.d(16.0f), t100.d(12.0f));
            this.f5412j.setOnClickListener(new View.OnClickListener() { // from class: l.as00
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f5810a.m8203Y(moment, view);
                }
            });
            this.f5412j.setOnLongClickListener(this);
        } else {
            linearLayout.setOnClickListener(new View.OnClickListener() { // from class: l.bs00
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f6420a.m8204Z(moment, view);
                }
            });
            this.f5410h.setOnLongClickListener(this);
        }
        this.f5413k.setVisibility(8);
    }

    /* JADX INFO: renamed from: b0 */
    public void m8206b0(Act act, final Moment moment) {
        act.dialog().f0(new String[]{act.getString(R$string.f569n), act.getString(R$string.f513f)}).g0(new Dialog.g() { // from class: l.cs00
            /* JADX INFO: renamed from: a */
            public final void m9235a(Dialog dialog, View view, int i, CharSequence charSequence) {
                MomentsInProfileView.m8195P(moment, dialog, view, i, charSequence);
            }
        }).z0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m8199T(this);
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        MomentsInProfileAct momentsInProfileActM8200V = m8200V();
        Moment moment = this.f5416n;
        v1h.m15271x0(momentsInProfileActM8200V, moment.owner, moment, null, null, null, false, true, false);
        return true;
    }

    public MomentsInProfileView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5414l = new VDraweeView[4];
    }

    public MomentsInProfileView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5414l = new VDraweeView[4];
    }
}
