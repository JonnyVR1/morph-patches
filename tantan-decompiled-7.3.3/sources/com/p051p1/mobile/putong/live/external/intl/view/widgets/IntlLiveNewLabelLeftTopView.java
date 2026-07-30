package com.p051p1.mobile.putong.live.external.intl.view.widgets;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Space;
import androidx.constraintlayout.widget.C0223a;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.live.base.data.BLiveCoverLabel;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VDraweeView;
import p151v.VLinear;
import p151v.VText;
import p153l.bnl0;
import p153l.dwn;
import p153l.fc2;
import p153l.izs;
import p153l.n3d0;
import p153l.qa00;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m88120d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\r\u0010\fJ\u0015\u0010\u000e\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\fJ\u0017\u0010\u0010\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0010\u0010\fJ\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0011\u0010\fR\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001cR\u0018\u0010#\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010'\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0018\u0010)\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010\u0014R\u0018\u0010+\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010\u0018R\u0018\u0010-\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010\u001cR\u0018\u0010/\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010\u001c¨\u00060"}, m88121d2 = {"Lcom/p1/mobile/putong/live/external/intl/view/widgets/IntlLiveNewLabelLeftTopView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lcom/p1/mobile/putong/live/base/data/BLiveCoverLabel;", "data", "", "setAPlateData", "(Lcom/p1/mobile/putong/live/base/data/BLiveCoverLabel;)V", "setBPlateData", "setCPlateData", "h0", "i0", "j0", "Landroid/graphics/drawable/Drawable;", Constants.INAPP_DATA_TAG, "Landroid/graphics/drawable/Drawable;", "drawableA", "Lv/VText;", "e", "Lv/VText;", "textViewA", "Lv/VDraweeView;", "f", "Lv/VDraweeView;", "imageViewAStart", "g", "imageViewABackground", "Lv/VLinear;", "h", "Lv/VLinear;", "linearLayoutA", "Landroid/widget/Space;", RXScreenCaptureService.KEY_INDEX, "Landroid/widget/Space;", OMSTemplateModeType.space, "j", "drawableB", "k", "textViewB", BLiveStormDanmakuGiftResourceType.f45292l, "imageViewBBackground", "m", "imageViewC", "external_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class IntlLiveNewLabelLeftTopView extends ConstraintLayout {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public Drawable drawableA;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public VText textViewA;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public VDraweeView imageViewAStart;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    public VDraweeView imageViewABackground;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    public VLinear linearLayoutA;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    public Space space;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    public Drawable drawableB;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    public VText textViewB;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @Nullable
    public VDraweeView imageViewBBackground;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @Nullable
    public VDraweeView imageViewC;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntlLiveNewLabelLeftTopView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
    }

    /* JADX INFO: renamed from: h0 */
    public final void m71520h0(BLiveCoverLabel data) {
        removeAllViews();
        VLinear vLinear = new VLinear(getContext());
        this.linearLayoutA = vLinear;
        vLinear.setId(View.generateViewId());
        VLinear vLinear2 = this.linearLayoutA;
        if (vLinear2 != null) {
            vLinear2.setOrientation(0);
        }
        VLinear vLinear3 = this.linearLayoutA;
        if (vLinear3 != null) {
            int i = qa00.f156320g;
            int i2 = qa00.f156317d;
            vLinear3.setPadding(i, i2, i, i2);
        }
        VLinear vLinear4 = this.linearLayoutA;
        if (vLinear4 != null) {
            vLinear4.setGravity(16);
        }
        dwn dwnVar = dwn.INSTANCE;
        GradientDrawable gradientDrawableM124981k = fc2.m124981k(dwnVar.m118419c(data.background, 0), dwnVar.m118419c(data.background, 1), 6, dwnVar.m118420d(data.linearGradient));
        this.drawableA = gradientDrawableM124981k;
        VLinear vLinear5 = this.linearLayoutA;
        if (vLinear5 != null) {
            vLinear5.setBackground(gradientDrawableM124981k);
        }
        String str = data.icon;
        str.getClass();
        if (str.length() > 0) {
            this.imageViewAStart = new VDraweeView(getContext());
            int i3 = qa00.f156324k;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i3, i3);
            VLinear vLinear6 = this.linearLayoutA;
            if (vLinear6 != null) {
                vLinear6.addView(this.imageViewAStart, layoutParams);
            }
        }
        VText vText = new VText(getContext());
        this.textViewA = vText;
        vText.setTextSize(2, 10.0f);
        VText vText2 = this.textViewA;
        if (vText2 != null) {
            vText2.setText(data.text);
        }
        VText vText3 = this.textViewA;
        if (vText3 != null) {
            vText3.setMaxEms(8);
        }
        String str2 = data.fontColor;
        str2.getClass();
        int length = str2.length();
        VText vText4 = this.textViewA;
        if (length > 0) {
            if (vText4 != null) {
                vText4.setTextColor(n3d0.m161283g(data.fontColor));
            }
        } else if (vText4 != null) {
            vText4.setTextColor(-1);
        }
        ConstraintLayout.C0221a c0221a = new ConstraintLayout.C0221a(-2, -2);
        String str3 = data.icon;
        str3.getClass();
        if (str3.length() > 0) {
            c0221a.setMarginStart(bnl0.m105587w(3.0f));
        }
        VLinear vLinear7 = this.linearLayoutA;
        if (vLinear7 != null) {
            vLinear7.addView(this.textViewA, c0221a);
        }
        addView(this.linearLayoutA);
        String str4 = data.bgImage;
        str4.getClass();
        if (str4.length() > 0) {
            String str5 = data.text;
            str5.getClass();
            if (str5.length() > 0) {
                VDraweeView vDraweeView = new VDraweeView(getContext());
                this.imageViewABackground = vDraweeView;
                vDraweeView.setId(View.generateViewId());
                addView(this.imageViewABackground, new ConstraintLayout.C0221a(0, 0));
                C0223a c0223a = new C0223a();
                c0223a.m1149c(this);
                VLinear vLinear8 = this.linearLayoutA;
                vLinear8.getClass();
                c0223a.m1163r(vLinear8.getId(), 10.0f);
                VDraweeView vDraweeView2 = this.imageViewABackground;
                vDraweeView2.getClass();
                c0223a.m1163r(vDraweeView2.getId(), 6.0f);
                VDraweeView vDraweeView3 = this.imageViewABackground;
                vDraweeView3.getClass();
                int id = vDraweeView3.getId();
                VLinear vLinear9 = this.linearLayoutA;
                vLinear9.getClass();
                c0223a.m1151e(id, 6, vLinear9.getId(), 6);
                VDraweeView vDraweeView4 = this.imageViewABackground;
                vDraweeView4.getClass();
                int id2 = vDraweeView4.getId();
                VLinear vLinear10 = this.linearLayoutA;
                vLinear10.getClass();
                c0223a.m1151e(id2, 3, vLinear10.getId(), 3);
                VDraweeView vDraweeView5 = this.imageViewABackground;
                vDraweeView5.getClass();
                int id3 = vDraweeView5.getId();
                VLinear vLinear11 = this.linearLayoutA;
                vLinear11.getClass();
                c0223a.m1151e(id3, 4, vLinear11.getId(), 4);
                VDraweeView vDraweeView6 = this.imageViewABackground;
                vDraweeView6.getClass();
                int id4 = vDraweeView6.getId();
                VLinear vLinear12 = this.linearLayoutA;
                vLinear12.getClass();
                c0223a.m1151e(id4, 7, vLinear12.getId(), 7);
                c0223a.m1147a(this);
                return;
            }
        }
        String str6 = data.bgImage;
        str6.getClass();
        if (str6.length() > 0) {
            VDraweeView vDraweeView7 = new VDraweeView(getContext());
            this.imageViewABackground = vDraweeView7;
            vDraweeView7.setId(View.generateViewId());
            VDraweeView vDraweeView8 = this.imageViewABackground;
            if (vDraweeView8 != null) {
                vDraweeView8.setAspectRatio(data.bgImageW / data.bgImageH);
            }
            addView(this.imageViewABackground, new ConstraintLayout.C0221a(-2, qa00.f156328o));
            C0223a c0223a2 = new C0223a();
            c0223a2.m1149c(this);
            VLinear vLinear13 = this.linearLayoutA;
            vLinear13.getClass();
            c0223a2.m1163r(vLinear13.getId(), 10.0f);
            VDraweeView vDraweeView9 = this.imageViewABackground;
            vDraweeView9.getClass();
            c0223a2.m1163r(vDraweeView9.getId(), 6.0f);
            VLinear vLinear14 = this.linearLayoutA;
            vLinear14.getClass();
            int id5 = vLinear14.getId();
            VDraweeView vDraweeView10 = this.imageViewABackground;
            vDraweeView10.getClass();
            c0223a2.m1151e(id5, 7, vDraweeView10.getId(), 7);
            c0223a2.m1147a(this);
        }
    }

    /* JADX INFO: renamed from: i0 */
    public final void m71521i0(BLiveCoverLabel data) {
        if (this.linearLayoutA == null) {
            return;
        }
        Space space = new Space(getContext());
        this.space = space;
        space.setId(View.generateViewId());
        addView(this.space);
        C0223a c0223a = new C0223a();
        c0223a.m1149c(this);
        Space space2 = this.space;
        space2.getClass();
        int id = space2.getId();
        VLinear vLinear = this.linearLayoutA;
        vLinear.getClass();
        c0223a.m1152f(id, 7, vLinear.getId(), 7, bnl0.m105587w(6.5f));
        c0223a.m1147a(this);
        String str = data.text;
        str.getClass();
        if (str.length() > 0) {
            String str2 = data.bgImage;
            str2.getClass();
            if (str2.length() == 0) {
                VText vText = new VText(getContext());
                this.textViewB = vText;
                vText.setId(View.generateViewId());
                VText vText2 = this.textViewB;
                if (vText2 != null) {
                    vText2.setText(data.text);
                }
                String str3 = data.fontColor;
                str3.getClass();
                int length = str3.length();
                VText vText3 = this.textViewB;
                if (length > 0) {
                    if (vText3 != null) {
                        vText3.setTextColor(n3d0.m161283g(data.fontColor));
                    }
                } else if (vText3 != null) {
                    vText3.setTextColor(-1);
                }
                VText vText4 = this.textViewB;
                if (vText4 != null) {
                    vText4.setTextSize(2, 10.0f);
                }
                VText vText5 = this.textViewB;
                if (vText5 != null) {
                    int i = qa00.f156322i;
                    int i2 = qa00.f156317d;
                    vText5.setPadding(i, i2, qa00.f156320g, i2);
                }
                dwn dwnVar = dwn.INSTANCE;
                GradientDrawable gradientDrawableM124981k = fc2.m124981k(dwnVar.m118419c(data.background, 0), dwnVar.m118419c(data.background, 1), 6, dwnVar.m118420d(data.linearGradient));
                this.drawableB = gradientDrawableM124981k;
                VText vText6 = this.textViewB;
                if (vText6 != null) {
                    vText6.setBackground(gradientDrawableM124981k);
                }
                addView(this.textViewB);
                C0223a c0223a2 = new C0223a();
                c0223a2.m1149c(this);
                VLinear vLinear2 = this.linearLayoutA;
                vLinear2.getClass();
                c0223a2.m1163r(vLinear2.getId(), 10.0f);
                VText vText7 = this.textViewB;
                vText7.getClass();
                c0223a2.m1163r(vText7.getId(), 4.0f);
                VText vText8 = this.textViewB;
                vText8.getClass();
                int id2 = vText8.getId();
                Space space3 = this.space;
                space3.getClass();
                c0223a2.m1151e(id2, 6, space3.getId(), 7);
                VText vText9 = this.textViewB;
                vText9.getClass();
                int id3 = vText9.getId();
                VLinear vLinear3 = this.linearLayoutA;
                vLinear3.getClass();
                c0223a2.m1151e(id3, 3, vLinear3.getId(), 3);
                VText vText10 = this.textViewB;
                vText10.getClass();
                int id4 = vText10.getId();
                VLinear vLinear4 = this.linearLayoutA;
                vLinear4.getClass();
                c0223a2.m1151e(id4, 4, vLinear4.getId(), 4);
                c0223a2.m1147a(this);
                return;
            }
        }
        String str4 = data.text;
        str4.getClass();
        if (str4.length() > 0) {
            String str5 = data.bgImage;
            str5.getClass();
            if (str5.length() > 0) {
                VDraweeView vDraweeView = new VDraweeView(getContext());
                this.imageViewBBackground = vDraweeView;
                vDraweeView.setId(View.generateViewId());
                VDraweeView vDraweeView2 = this.imageViewBBackground;
                if (vDraweeView2 != null) {
                    vDraweeView2.setAspectRatio(data.bgImageW / data.bgImageH);
                }
                addView(this.imageViewBBackground, new ConstraintLayout.C0221a(-2, qa00.f156328o));
                VText vText11 = new VText(getContext());
                this.textViewB = vText11;
                vText11.setId(View.generateViewId());
                VText vText12 = this.textViewB;
                if (vText12 != null) {
                    vText12.setText(data.text);
                }
                String str6 = data.fontColor;
                str6.getClass();
                int length2 = str6.length();
                VText vText13 = this.textViewB;
                if (length2 > 0) {
                    if (vText13 != null) {
                        vText13.setTextColor(n3d0.m161283g(data.fontColor));
                    }
                } else if (vText13 != null) {
                    vText13.setTextColor(-1);
                }
                VText vText14 = this.textViewB;
                if (vText14 != null) {
                    vText14.setTextSize(2, 10.0f);
                }
                VText vText15 = this.textViewB;
                if (vText15 != null) {
                    int i3 = qa00.f156322i;
                    int i4 = qa00.f156317d;
                    vText15.setPadding(i3, i4, qa00.f156320g, i4);
                }
                addView(this.textViewB);
                C0223a c0223a3 = new C0223a();
                c0223a3.m1149c(this);
                VText vText16 = this.textViewB;
                vText16.getClass();
                int id5 = vText16.getId();
                Space space4 = this.space;
                space4.getClass();
                c0223a3.m1151e(id5, 6, space4.getId(), 7);
                VText vText17 = this.textViewB;
                vText17.getClass();
                int id6 = vText17.getId();
                VDraweeView vDraweeView3 = this.imageViewBBackground;
                vDraweeView3.getClass();
                c0223a3.m1151e(id6, 3, vDraweeView3.getId(), 3);
                VText vText18 = this.textViewB;
                vText18.getClass();
                int id7 = vText18.getId();
                VDraweeView vDraweeView4 = this.imageViewBBackground;
                vDraweeView4.getClass();
                c0223a3.m1151e(id7, 4, vDraweeView4.getId(), 4);
                VText vText19 = this.textViewB;
                vText19.getClass();
                int id8 = vText19.getId();
                VDraweeView vDraweeView5 = this.imageViewBBackground;
                vDraweeView5.getClass();
                c0223a3.m1151e(id8, 6, vDraweeView5.getId(), 6);
                VText vText20 = this.textViewB;
                vText20.getClass();
                int id9 = vText20.getId();
                VDraweeView vDraweeView6 = this.imageViewBBackground;
                vDraweeView6.getClass();
                c0223a3.m1151e(id9, 7, vDraweeView6.getId(), 7);
                VDraweeView vDraweeView7 = this.imageViewBBackground;
                vDraweeView7.getClass();
                int id10 = vDraweeView7.getId();
                Space space5 = this.space;
                space5.getClass();
                c0223a3.m1152f(id10, 6, space5.getId(), 7, 0);
                c0223a3.m1147a(this);
                return;
            }
        }
        VDraweeView vDraweeView8 = new VDraweeView(getContext());
        this.imageViewBBackground = vDraweeView8;
        vDraweeView8.setId(View.generateViewId());
        VDraweeView vDraweeView9 = this.imageViewBBackground;
        if (vDraweeView9 != null) {
            vDraweeView9.setAspectRatio(data.bgImageW / data.bgImageH);
        }
        addView(this.imageViewBBackground, new ConstraintLayout.C0221a(-2, qa00.f156328o));
        C0223a c0223a4 = new C0223a();
        c0223a4.m1149c(this);
        VDraweeView vDraweeView10 = this.imageViewBBackground;
        vDraweeView10.getClass();
        c0223a4.m1163r(vDraweeView10.getId(), 3.0f);
        VDraweeView vDraweeView11 = this.imageViewBBackground;
        vDraweeView11.getClass();
        int id11 = vDraweeView11.getId();
        Space space6 = this.space;
        space6.getClass();
        c0223a4.m1151e(id11, 6, space6.getId(), 7);
        c0223a4.m1147a(this);
    }

    /* JADX INFO: renamed from: j0 */
    public final void m71522j0(BLiveCoverLabel data) {
        removeAllViews();
        VDraweeView vDraweeView = new VDraweeView(getContext());
        this.imageViewC = vDraweeView;
        vDraweeView.setAspectRatio(data.bgImageW / data.bgImageH);
        addView(this.imageViewC, new LinearLayout.LayoutParams(-2, qa00.f156328o));
    }

    public final void setAPlateData(@NotNull BLiveCoverLabel data) {
        data.getClass();
        m71520h0(data);
        VDraweeView vDraweeView = this.imageViewAStart;
        if (vDraweeView != null) {
            izs.m142868s("context_square", vDraweeView, data.icon);
        }
        VDraweeView vDraweeView2 = this.imageViewABackground;
        if (vDraweeView2 != null) {
            izs.m142868s("context_square", vDraweeView2, data.bgImage);
        }
    }

    public final void setBPlateData(@NotNull BLiveCoverLabel data) {
        data.getClass();
        m71521i0(data);
        izs.m142868s("context_square", this.imageViewBBackground, data.bgImage);
        VText vText = this.textViewB;
        if (vText != null) {
            vText.setText(data.text);
        }
    }

    public final void setCPlateData(@NotNull BLiveCoverLabel data) {
        data.getClass();
        m71522j0(data);
        izs.m142868s("context_square", this.imageViewC, data.bgImage);
    }
}
