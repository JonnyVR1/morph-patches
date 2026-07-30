package com.p000p1.mobile.putong.oms;

import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.legacy.widget.Space;
import androidx.viewpager.widget.ViewPager;
import com.facebook.drawee.generic.RoundingParams;
import com.p000p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickerParamsObject;
import com.p000p1.mobile.putong.oms.OmsBaseRender;
import com.p000p1.mobile.putong.oms.view.OmsViewPager;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.Dialog;
import com.p1.mobile.putong.ab.IntlCountryCodeController;
import com.p1.mobile.putong.data.OMSAction;
import com.p1.mobile.putong.data.OMSBaseStyle;
import com.p1.mobile.putong.data.OMSDialog;
import com.p1.mobile.putong.data.OMSDialogInfo;
import com.p1.mobile.putong.data.OMSLocationType;
import com.p1.mobile.putong.data.OMSSizeType;
import com.p1.mobile.putong.data.OMSTemplateModeType;
import com.p1.mobile.putong.data.OmsMerCuryData;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import l.c4g0;
import l.cwf0;
import l.d30;
import l.djj;
import l.e30;
import l.eb2;
import l.ftd0;
import l.j760;
import l.jo0;
import l.mkd0;
import l.osi0;
import l.qib0;
import l.u7c0;
import l.v0c0;
import l.vwb;
import l.xdl0;
import org.json.JSONArray;
import org.json.JSONException;
import p009l.dji0;
import p009l.i0e;
import p009l.ic50;
import p009l.nc50;
import p009l.ry50;
import p009l.xc50;
import p009l.zuj0;
import rx.c;
import v.VCheckBox;
import v.VDraweeView;
import v.VFrame;
import v.VLinear;
import v.VPagerCircleIndicator;
import v.VRelative;
import v.VSwitchButton;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class OmsBaseRender {

    /* JADX INFO: renamed from: o */
    public static int f7826o = 100;

    /* JADX INFO: renamed from: a */
    public Act f7827a;

    /* JADX INFO: renamed from: b */
    public OMSDialogInfo f7828b;

    /* JADX INFO: renamed from: c */
    public Dialog.e f7829c;

    /* JADX INFO: renamed from: e */
    public OmsViewPager f7831e;

    /* JADX INFO: renamed from: f */
    public OMSDialog f7832f;

    /* JADX INFO: renamed from: g */
    public c4g0 f7833g;

    /* JADX INFO: renamed from: h */
    public boolean f7834h;

    /* JADX INFO: renamed from: i */
    public View f7835i;

    /* JADX INFO: renamed from: j */
    public boolean f7836j;

    /* JADX INFO: renamed from: l */
    public cwf0 f7838l;

    /* JADX INFO: renamed from: m */
    public DialogInterface.OnDismissListener f7839m;

    /* JADX INFO: renamed from: n */
    public DialogInterface.OnShowListener f7840n;

    /* JADX INFO: renamed from: d */
    public List<C0496c> f7830d = new ArrayList();

    /* JADX INFO: renamed from: k */
    public Map<OMSAction, OMSDialog> f7837k = new HashMap();

    public enum GroupLayoutType {
        linear,
        relative,
        frame
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.oms.OmsBaseRender$a */
    public class C0494a implements ViewPager.j {
        public C0494a() {
        }

        public void onPageScrollStateChanged(int i) {
        }

        public void onPageScrolled(int i, float f, int i2) {
        }

        public void onPageSelected(int i) {
            for (C0496c c0496c : OmsBaseRender.this.f7830d) {
                if (i >= c0496c.f7845c.size()) {
                    return;
                }
                OmsBaseRender.this.m9583X(c0496c.f7843a, c0496c.f7846d, i);
                OmsBaseRender.this.m9586a0(c0496c.f7844b, c0496c.f7845c.get(i));
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.oms.OmsBaseRender$b */
    public static /* synthetic */ class C0495b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f7842a;

        static {
            int[] iArr = new int[GroupLayoutType.values().length];
            f7842a = iArr;
            try {
                iArr[GroupLayoutType.frame.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7842a[GroupLayoutType.relative.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.oms.OmsBaseRender$c */
    public static class C0496c {

        /* JADX INFO: renamed from: a */
        public View f7843a;

        /* JADX INFO: renamed from: b */
        public TextView f7844b;

        /* JADX INFO: renamed from: c */
        public List<OMSDialog> f7845c;

        /* JADX INFO: renamed from: d */
        public OMSDialog f7846d;

        public C0496c(View view, TextView textView, List<OMSDialog> list, OMSDialog oMSDialog) {
            this.f7843a = view;
            this.f7844b = textView;
            this.f7845c = list;
            this.f7846d = oMSDialog;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.oms.OmsBaseRender$d */
    public class C0497d extends eb2 {

        /* JADX INFO: renamed from: e */
        public List<OMSDialog> f7847e;

        public C0497d(OMSDialog oMSDialog) {
            this.f7847e = OmsBaseRender.this.m9578S(oMSDialog);
        }

        public int getCount() {
            if (vwb.J(this.f7847e)) {
                return 0;
            }
            return this.f7847e.size();
        }

        public boolean isViewFromObject(@NonNull View view, @NonNull Object obj) {
            return view == obj;
        }

        /* JADX INFO: renamed from: o */
        public void m9598o(ViewGroup viewGroup, int i, Object obj) {
            viewGroup.removeView((View) obj);
        }

        /* JADX INFO: renamed from: p */
        public Object m9599p(ViewGroup viewGroup, int i) {
            View viewM9581V = OmsBaseRender.this.m9581V(this.f7847e.get(i));
            viewGroup.addView(viewM9581V);
            return viewM9581V;
        }
    }

    public OmsBaseRender(Act act, OMSDialogInfo oMSDialogInfo) {
        this.f7827a = act;
        this.f7828b = oMSDialogInfo;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m9542b() {
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m9545e() {
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m9551k() {
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m9553m() {
    }

    /* JADX INFO: renamed from: A */
    public final void m9560A(ViewGroup viewGroup, OMSDialog oMSDialog) {
        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        this.f7831e = new OmsViewPager(this.f7827a);
        final C0497d c0497d = new C0497d(oMSDialog);
        this.f7831e.setAdapter(c0497d);
        this.f7831e.setOffscreenPageLimit(c0497d.getCount());
        this.f7831e.setScrollble(oMSDialog.style.canSlide);
        this.f7831e.d(new C0494a());
        m9590t(viewGroup, this.f7831e, layoutParams, new d30() { // from class: l.ba50
            public final void call() {
                OmsBaseRender.m9553m();
            }
        });
        if (oMSDialog.style.showIndicator) {
            View vPagerCircleIndicator = new VPagerCircleIndicator(this.f7827a);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
            vPagerCircleIndicator.setFillColor(Color.parseColor(oMSDialog.style.indicatorColor));
            vPagerCircleIndicator.setRadius(xdl0.w(oMSDialog.style.indicatorRadius));
            vPagerCircleIndicator.setPageColor(Color.parseColor(oMSDialog.style.indicatorBgColor));
            vPagerCircleIndicator.setOrientation(TEnum.equals(oMSDialog.style.direction, "v") ? 1 : 0);
            OmsViewPager omsViewPager = this.f7831e;
            vPagerCircleIndicator.c(omsViewPager, omsViewPager.getCurrentItem());
            layoutParams2.gravity = 1;
            m9590t(viewGroup, vPagerCircleIndicator, layoutParams2, new d30() { // from class: l.o950
                public final void call() {
                    OmsBaseRender.m9551k();
                }
            });
        }
        OMSBaseStyle oMSBaseStyle = oMSDialog.style;
        if (oMSBaseStyle.autoSwitch) {
            this.f7833g = c.interval(oMSBaseStyle.autoSwitchTime, TimeUnit.MILLISECONDS).onBackpressureLatest().observeOn(jo0.a()).subscribe(mkd0.G(new e30() { // from class: l.p950
                public final void call(Object obj) {
                    this.f18431a.m9567H(c0497d, (Long) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: B */
    public final void m9561B(ViewGroup viewGroup, OMSDialog oMSDialog) {
        f7826o++;
        final OMSDialog oMSDialogM9579T = m9579T(oMSDialog);
        final View viewM9591u = m9591u(oMSDialogM9579T);
        if (NullChecker.a(viewM9591u)) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) m9562C(GroupLayoutType.relative, oMSDialogM9579T, viewGroup);
            layoutParams.setMargins(xdl0.w((int) oMSDialogM9579T.style.marginLeft), xdl0.w((int) oMSDialogM9579T.style.marginTop), xdl0.w((int) oMSDialogM9579T.style.marginRight), xdl0.w((int) oMSDialogM9579T.style.marginBottom));
            viewM9591u.setId(f7826o);
            Iterator it = oMSDialogM9579T.style.location.iterator();
            while (it.hasNext()) {
                layoutParams.addRule(xc50.m24771e((OMSLocationType) it.next()));
            }
            m9590t(viewGroup, viewM9591u, layoutParams, new d30() { // from class: l.y950
                public final void call() {
                    this.f22936a.m9568I(oMSDialogM9579T, viewM9591u);
                }
            });
        }
        for (final OMSDialog oMSDialog2 : m9578S(oMSDialog)) {
            if (TEnum.equals(oMSDialog2.type, "extra")) {
                this.f7832f = oMSDialog2;
            } else {
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) m9562C(GroupLayoutType.relative, oMSDialog2, viewGroup);
                final View viewM9591u2 = m9591u(oMSDialog2);
                layoutParams2.setMargins(xdl0.w((int) oMSDialog2.style.marginLeft), xdl0.w((int) oMSDialog2.style.marginTop), xdl0.w((int) oMSDialog2.style.marginRight), xdl0.w((int) oMSDialog2.style.marginBottom));
                for (OMSLocationType oMSLocationType : oMSDialog2.style.location) {
                    if (oMSDialog2.needApplyChild) {
                        layoutParams2.addRule(xc50.m24771e(oMSLocationType), f7826o);
                    } else {
                        layoutParams2.addRule(xc50.m24771e(oMSLocationType));
                    }
                }
                m9590t(viewGroup, viewM9591u2, layoutParams2, new d30() { // from class: l.z950
                    public final void call() {
                        this.f23521a.m9569J(oMSDialog2, viewM9591u2);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: C */
    public final ViewGroup.LayoutParams m9562C(GroupLayoutType groupLayoutType, OMSDialog oMSDialog, ViewGroup viewGroup) {
        int iM9563D;
        int iM9563D2;
        boolean zEquals = TEnum.equals(oMSDialog.style.widthType, "ratio");
        OMSBaseStyle oMSBaseStyle = oMSDialog.style;
        if (zEquals) {
            OMSSizeType oMSSizeType = oMSBaseStyle.heightType;
            int i = (int) oMSBaseStyle.height;
            float f = oMSBaseStyle.width;
            iM9563D = m9563D(oMSSizeType, i, f > 0.0f ? (int) f : viewGroup.getWidth(), oMSDialog.style.ratio);
            OMSBaseStyle oMSBaseStyle2 = oMSDialog.style;
            OMSSizeType oMSSizeType2 = oMSBaseStyle2.widthType;
            int i2 = (int) oMSBaseStyle2.width;
            float f2 = oMSBaseStyle2.height;
            iM9563D2 = m9563D(oMSSizeType2, i2, f2 > 0.0f ? (int) f2 : viewGroup.getHeight(), oMSDialog.style.ratio);
        } else {
            OMSSizeType oMSSizeType3 = oMSBaseStyle.widthType;
            int i3 = (int) oMSBaseStyle.width;
            float f3 = oMSBaseStyle.height;
            int iM9563D3 = m9563D(oMSSizeType3, i3, f3 > 0.0f ? (int) f3 : viewGroup.getHeight(), oMSDialog.style.ratio);
            OMSBaseStyle oMSBaseStyle3 = oMSDialog.style;
            OMSSizeType oMSSizeType4 = oMSBaseStyle3.heightType;
            int i4 = (int) oMSBaseStyle3.height;
            float f4 = oMSBaseStyle3.width;
            iM9563D = m9563D(oMSSizeType4, i4, f4 > 0.0f ? (int) f4 : viewGroup.getWidth(), oMSDialog.style.ratio);
            iM9563D2 = iM9563D3;
        }
        if (TEnum.equals(oMSDialog.type, "page")) {
            iM9563D = -2;
        }
        int i5 = C0495b.f7842a[groupLayoutType.ordinal()];
        if (i5 != 1) {
            return i5 != 2 ? new LinearLayout.LayoutParams(iM9563D2, iM9563D) : new RelativeLayout.LayoutParams(iM9563D2, iM9563D);
        }
        return new FrameLayout.LayoutParams(iM9563D2, iM9563D);
    }

    /* JADX INFO: renamed from: D */
    public final int m9563D(OMSSizeType oMSSizeType, int i, int i2, float f) {
        String string = oMSSizeType.toString();
        string.getClass();
        switch (string) {
            case "ratio":
                return (int) (xdl0.w(i2) * f);
            case "wrap_content":
                return -2;
            case "match_parent":
                return -1;
            default:
                return xdl0.w(i);
        }
    }

    /* JADX INFO: renamed from: E */
    public final boolean m9564E(OMSTemplateModeType oMSTemplateModeType) {
        return TEnum.equals(oMSTemplateModeType, "hstack") || TEnum.equals(oMSTemplateModeType, "vstack") || TEnum.equals(oMSTemplateModeType, "overlap") || TEnum.equals(oMSTemplateModeType, "button") || TEnum.equals(oMSTemplateModeType, "page");
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m9565F(OMSDialog oMSDialog, View view) {
        if (m9564E(oMSDialog.type)) {
            m9593w((ViewGroup) view, oMSDialog);
        }
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m9566G(OMSDialog oMSDialog, View view) {
        if (m9564E(oMSDialog.type)) {
            m9593w((ViewGroup) view, oMSDialog);
        }
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m9567H(C0497d c0497d, Long l2) {
        int currentItem = this.f7831e.getCurrentItem();
        int size = c0497d.f7847e.size() - 1;
        OmsViewPager omsViewPager = this.f7831e;
        if (currentItem == size) {
            omsViewPager.T(0, true);
        } else {
            omsViewPager.T(omsViewPager.getCurrentItem() + 1, true);
        }
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m9568I(OMSDialog oMSDialog, View view) {
        if (m9564E(oMSDialog.type)) {
            m9593w((ViewGroup) view, oMSDialog);
        }
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m9569J(OMSDialog oMSDialog, View view) {
        if (m9564E(oMSDialog.type)) {
            m9593w((ViewGroup) view, oMSDialog);
        }
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m9570K(OMSDialog oMSDialog, View view) {
        if (m9564E(oMSDialog.type)) {
            m9593w((ViewGroup) view, oMSDialog);
        }
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m9571L(View view, Bitmap bitmap) {
        if (view == null || bitmap.isRecycled()) {
            return;
        }
        view.setBackground(new BitmapDrawable(this.f7827a.getResources(), bitmap));
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m9572M(final View view, OMSDialog oMSDialog, final Bitmap bitmap) {
        if (NullChecker.a(bitmap)) {
            this.f7827a.runOnUiThread(new Runnable() { // from class: l.s950
                @Override // java.lang.Runnable
                public final void run() {
                    this.f20135a.m9571L(view, bitmap);
                }
            });
            return;
        }
        CrashHelper.d(new RuntimeException("OMSDialogRender identifer:" + this.f7828b.identifier + " bgUrl:" + oMSDialog.bgImage), 100);
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m9573N(OMSDialog oMSDialog, int i, View view) {
        boolean z;
        boolean z2;
        if (vwb.J(nc50.m18839f().m18841b())) {
            return;
        }
        OMSAction oMSAction = (OMSAction) oMSDialog.actions.get(i);
        Iterator<zuj0> it = nc50.m18839f().m18841b().iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                z2 = false;
                break;
            } else if (it.next().m25981a(oMSAction, this)) {
                z = true;
                z2 = !vwb.J(oMSAction.preCondition);
                break;
            }
        }
        if (!z) {
            new ry50().m25983e(this).mo11784c((OMSAction) oMSDialog.actions.get(i));
        }
        if (z2 || TextUtils.isEmpty(oMSDialog.mercury.id)) {
            return;
        }
        OmsMerCuryData omsMerCuryData = oMSDialog.mercury;
        xc50.m24773g(omsMerCuryData.id, this.f7828b.mercury.id, omsMerCuryData.server);
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m9574O(DialogInterface dialogInterface) {
        m9585Z();
        i0e.m16065f(this.f7838l);
        DialogInterface.OnShowListener onShowListener = this.f7840n;
        if (onShowListener != null) {
            onShowListener.onShow(dialogInterface);
        }
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m9575P(DialogInterface dialogInterface) {
        mkd0.z(this.f7833g);
        i0e.m16064e(this.f7838l);
        nc50.m18839f().m18847i();
        DialogInterface.OnDismissListener onDismissListener = this.f7839m;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(dialogInterface);
        }
    }

    /* JADX INFO: renamed from: Q */
    public void m9576Q() {
        if (this.f7827a.isFinishing() || this.f7827a.isDestroyed() || this.f7829c.Y() == null || !this.f7829c.Y().isShowing()) {
            return;
        }
        mkd0.z(this.f7833g);
        i0e.m16064e(this.f7838l);
        this.f7829c.Y().dismiss();
    }

    /* JADX INFO: renamed from: R */
    public void m9577R() {
        this.f7829c = this.f7827a.dialog();
        this.f7835i = m9581V(this.f7828b.content.morph);
    }

    /* JADX INFO: renamed from: S */
    public final List<OMSDialog> m9578S(OMSDialog oMSDialog) {
        ArrayList arrayList = new ArrayList();
        List<OMSDialog> list = oMSDialog.nodesJson;
        if (list != null) {
            return list;
        }
        try {
            JSONArray jSONArray = new JSONArray(oMSDialog.nodes);
            for (int i = 0; i < jSONArray.length(); i++) {
                arrayList.add((OMSDialog) OMSDialog.JSON_ADAPTER.parse(jSONArray.getString(i)));
            }
        } catch (IOException | JSONException e) {
            CrashHelper.c(e);
            this.f7834h = true;
            e.toString();
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: T */
    public final OMSDialog m9579T(OMSDialog oMSDialog) {
        OMSDialog oMSDialog2 = oMSDialog.childJson;
        if (oMSDialog2 != null) {
            return oMSDialog2;
        }
        try {
            return (OMSDialog) OMSDialog.JSON_ADAPTER.parse(oMSDialog.child);
        } catch (IOException e) {
            CrashHelper.c(e);
            this.f7834h = true;
            e.toString();
            return null;
        }
    }

    /* JADX INFO: renamed from: U */
    public void m9580U(String str) {
        OMSDialog value;
        Iterator<Map.Entry<OMSAction, OMSDialog>> it = this.f7837k.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                value = null;
                break;
            }
            Map.Entry<OMSAction, OMSDialog> next = it.next();
            if (TextUtils.equals(next.getKey().type, str)) {
                value = next.getValue();
                break;
            }
        }
        if (value == null) {
            return;
        }
        List list = ((OMSAction) value.actions.get(0)).preCondition;
        ((OMSAction) value.actions.get(0)).preCondition = null;
        if (!vwb.J(nc50.m18839f().m18841b())) {
            Iterator<zuj0> it2 = nc50.m18839f().m18841b().iterator();
            while (it2.hasNext()) {
                if (it2.next().m25981a((OMSAction) value.actions.get(0), this)) {
                }
            }
            new ry50().m25983e(this).mo11784c((OMSAction) value.actions.get(0));
        }
        ((OMSAction) value.actions.get(0)).preCondition = list;
    }

    /* JADX INFO: renamed from: V */
    public View m9581V(final OMSDialog oMSDialog) {
        ViewGroup frameLayout = new FrameLayout(this.f7827a);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) m9562C(GroupLayoutType.frame, oMSDialog, frameLayout);
        final View viewM9591u = m9591u(oMSDialog);
        layoutParams.setMargins(xdl0.w((int) oMSDialog.style.marginLeft), xdl0.w((int) oMSDialog.style.marginTop), xdl0.w((int) oMSDialog.style.marginRight), xdl0.w((int) oMSDialog.style.marginBottom));
        m9590t(frameLayout, viewM9591u, layoutParams, new d30() { // from class: l.n950
            public final void call() {
                this.f17361a.m9570K(oMSDialog, viewM9591u);
            }
        });
        return frameLayout;
    }

    /* JADX INFO: renamed from: W */
    public final void m9582W(final View view, final OMSDialog oMSDialog) {
        if (!TextUtils.isEmpty(oMSDialog.bgImage)) {
            String strM13360g = dji0.m13360g(oMSDialog.bgImage);
            if (ic50.m16316j().m16323g().m17782a(strM13360g)) {
                view.setBackgroundResource(ic50.m16316j().m16323g().m17783b(strM13360g).intValue());
                return;
            } else {
                qib0.G.I(strM13360g, new e30() { // from class: l.v950
                    public final void call(Object obj) {
                        this.f21482a.m9572M(view, oMSDialog, (Bitmap) obj);
                    }
                });
                return;
            }
        }
        if (vwb.J(oMSDialog.style.bgColors)) {
            return;
        }
        int size = oMSDialog.style.bgColors.size() == 1 ? 2 : oMSDialog.style.bgColors.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            int size2 = oMSDialog.style.bgColors.size();
            OMSBaseStyle oMSBaseStyle = oMSDialog.style;
            if (i >= size2) {
                iArr[i] = Color.parseColor((String) oMSBaseStyle.bgColors.get(0));
            } else {
                iArr[i] = Color.parseColor((String) oMSBaseStyle.bgColors.get(i));
            }
        }
        GradientDrawable gradientDrawable = new GradientDrawable(TEnum.equals(oMSDialog.style.bgColorsDirection, "h") ? GradientDrawable.Orientation.LEFT_RIGHT : GradientDrawable.Orientation.TOP_BOTTOM, iArr);
        if (oMSDialog.style.cornerRadius > 0.0f) {
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius(oMSDialog.style.cornerRadius);
        }
        OMSBaseStyle oMSBaseStyle2 = oMSDialog.style;
        if (oMSBaseStyle2.borderWidth > 0.0f && !TextUtils.isEmpty(oMSBaseStyle2.borderColor)) {
            gradientDrawable.setStroke(xdl0.w(oMSDialog.style.borderWidth), Color.parseColor(oMSDialog.style.borderColor));
        }
        view.setBackground(gradientDrawable);
    }

    /* JADX INFO: renamed from: X */
    public final void m9583X(View view, final OMSDialog oMSDialog, final int i) {
        if (!NullChecker.a(oMSDialog.actions) || oMSDialog.actions.size() <= 0) {
            return;
        }
        this.f7837k.put((OMSAction) oMSDialog.actions.get(i), oMSDialog);
        view.setOnClickListener(new View.OnClickListener() { // from class: l.aa50
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f9344a.m9573N(oMSDialog, i, view2);
            }
        });
    }

    /* JADX INFO: renamed from: Y */
    public final void m9584Y(VDraweeView vDraweeView, OMSDialog oMSDialog, boolean z) {
        ftd0 ftd0VarM24770d = xc50.m24770d(oMSDialog.style.scaleType);
        djj hierarchy = vDraweeView.getHierarchy();
        if (NullChecker.a(ftd0VarM24770d)) {
            hierarchy.w(ftd0VarM24770d);
        }
        float f = oMSDialog.style.cornerRadius;
        if (f > 0.0f) {
            hierarchy.H(RoundingParams.c(f));
        }
        String strM13360g = dji0.m13360g(z ? oMSDialog.image : oMSDialog.src);
        if (!TextUtils.isEmpty(oMSDialog.foreImage)) {
            vDraweeView.setForeground(this.f7827a.getDrawable(ic50.m16316j().m16323g().m17783b(dji0.m13360g(oMSDialog.foreImage)).intValue()));
        }
        if (ic50.m16316j().m16323g().m17782a(strM13360g)) {
            vDraweeView.setImageResource(ic50.m16316j().m16323g().m17783b(strM13360g).intValue());
        } else if (!TextUtils.isEmpty(strM13360g)) {
            float f2 = oMSDialog.style.blurRadius;
            if (f2 == 0.0f) {
                qib0.G.L0(vDraweeView, strM13360g);
            } else {
                qib0.G.O(vDraweeView, strM13360g, 4, (int) f2);
            }
        }
        OMSBaseStyle oMSBaseStyle = oMSDialog.style;
        if (oMSBaseStyle.borderWidth <= 0.0f || TextUtils.isEmpty(oMSBaseStyle.borderColor)) {
            return;
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setStroke(xdl0.w(oMSDialog.style.borderWidth), Color.parseColor(oMSDialog.style.borderColor));
        vDraweeView.setBackground(gradientDrawable);
    }

    /* JADX INFO: renamed from: Z */
    public boolean m9585Z() {
        if (!NullChecker.a(this.f7832f)) {
            return false;
        }
        m9586a0(this.f7829c.Y().x, this.f7832f);
        m9583X(this.f7829c.Y().x, this.f7832f, 0);
        return true;
    }

    /* JADX INFO: renamed from: a0 */
    public final void m9586a0(TextView textView, OMSDialog oMSDialog) {
        Act act = this.f7827a;
        OMSDialogInfo oMSDialogInfo = this.f7828b;
        j760<SpannableStringBuilder, Boolean> j760VarM13359f = dji0.m13359f(act, oMSDialogInfo.needLanguage ? dji0.m13357d(oMSDialogInfo, oMSDialog) : oMSDialog.content, 1.0d, null);
        if (!TEnum.equals(oMSDialog.style.alignment, "unknown_")) {
            textView.setGravity(xc50.m24769c(oMSDialog.style.alignment));
        }
        textView.setText((CharSequence) j760VarM13359f.a);
        textView.setLineSpacing(oMSDialog.style.lineSpacing, 1.0f);
        if (((Boolean) j760VarM13359f.b).booleanValue()) {
            textView.setMovementMethod(LinkMovementMethod.getInstance());
        }
        if (IntlCountryCodeController.t()) {
            textView.setMaxLines(8);
        } else {
            textView.setMaxLines(4);
        }
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setHighlightColor(textView.getResources().getColor(v0c0.o));
    }

    /* JADX INFO: renamed from: b0 */
    public void m9587b0(DialogInterface.OnDismissListener onDismissListener) {
        this.f7839m = onDismissListener;
    }

    /* JADX INFO: renamed from: c0 */
    public void m9588c0() {
        this.f7829c = this.f7827a.dialog();
        this.f7838l = i0e.m16062c(this.f7828b.mercury.id, this.f7835i.getClass().getName());
        if (NullChecker.a(this.f7828b.mercury.server) && this.f7828b.mercury.server.size() > 0) {
            j760[] j760VarArr = new j760[this.f7828b.mercury.server.size()];
            int i = 0;
            for (Map.Entry entry : this.f7828b.mercury.server.entrySet()) {
                j760VarArr[i] = new j760((String) entry.getKey(), dji0.m13360g((String) entry.getValue()));
                i++;
            }
            this.f7838l.p(j760VarArr);
        }
        if (NullChecker.a(this.f7832f)) {
            this.f7829c.r0("temp");
        }
        this.f7829c.B(this.f7828b.cancelAble).P(this.f7835i, false).B0(new DialogInterface.OnShowListener() { // from class: l.t950
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                this.f20580a.m9574O(dialogInterface);
            }
        }).V(new DialogInterface.OnDismissListener() { // from class: l.u950
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f21020a.m9575P(dialogInterface);
            }
        });
        if (TEnum.equals(this.f7828b.content.morph.baseStyle, "bigScreen")) {
            this.f7829c.Q().L(u7c0.j);
        } else {
            boolean zEquals = TEnum.equals(this.f7828b.content.morph.style.uiType, "new_type");
            Dialog.e eVar = this.f7829c;
            if (zEquals) {
                eVar.L(u7c0.f);
            } else {
                eVar.u();
            }
        }
        nc50.m18839f().m18848j(this);
        this.f7829c.z0();
    }

    /* JADX INFO: renamed from: d0 */
    public void m9589d0(String str) {
        OMSDialogInfo oMSDialogInfo = this.f7828b;
        if (oMSDialogInfo.needLanguage) {
            str = dji0.m13358e(oMSDialogInfo, str);
        }
        osi0.g(str);
    }

    /* JADX INFO: renamed from: t */
    public final void m9590t(ViewGroup viewGroup, View view, ViewGroup.LayoutParams layoutParams, d30 d30Var) {
        if (view == null) {
            this.f7834h = true;
        } else {
            viewGroup.addView(view, layoutParams);
            d30Var.call();
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: u */
    public final View m9591u(OMSDialog oMSDialog) {
        String string = oMSDialog.type.toString();
        string.getClass();
        byte b = -1;
        switch (string.hashCode()) {
            case -1377687758:
                if (string.equals("button")) {
                    b = 0;
                }
                break;
            case -1207778528:
                if (string.equals("hstack")) {
                    b = 1;
                }
                break;
            case -1091287993:
                if (string.equals("overlap")) {
                    b = 2;
                }
                break;
            case -806970414:
                if (string.equals("vstack")) {
                    b = 3;
                }
                break;
            case -346969391:
                if (string.equals("switch_btn")) {
                    b = 4;
                }
                break;
            case 3433103:
                if (string.equals("page")) {
                    b = 5;
                }
                break;
            case 3556653:
                if (string.equals("text")) {
                    b = 6;
                }
                break;
            case 3619493:
                if (string.equals("view")) {
                    b = 7;
                }
                break;
            case 100313435:
                if (string.equals("image")) {
                    b = 8;
                }
                break;
            case 109637894:
                if (string.equals("space")) {
                    b = 9;
                }
                break;
            case 1536891843:
                if (string.equals("checkbox")) {
                    b = 10;
                }
                break;
        }
        VDraweeView vFrame = null;
        switch (b) {
            case 0:
                vFrame = new VFrame(this.f7827a);
                break;
            case 1:
            case 3:
                vFrame = new VLinear(this.f7827a);
                vFrame.setGravity(xc50.m24769c(oMSDialog.style.alignment));
                break;
            case 2:
                vFrame = (!TextUtils.isEmpty(oMSDialog.child) || oMSDialog.childJson != null) ? new VRelative(this.f7827a) : new VFrame(this.f7827a);
                break;
            case 4:
                vFrame = new VSwitchButton(this.f7827a);
                vFrame.setChecked(oMSDialog.style.checked);
                break;
            case 5:
                vFrame = new LinearLayout(this.f7827a);
                vFrame.setOrientation(1);
                break;
            case 6:
                vFrame = new VText(this.f7827a);
                m9586a0(vFrame, oMSDialog);
                break;
            case 7:
                vFrame = new View(this.f7827a);
                break;
            case 8:
                vFrame = new VDraweeView(this.f7827a);
                m9584Y(vFrame, oMSDialog, false);
                break;
            case MediaPickerParamsObject.FROM_JS_BRIDGE_SWIPE_CARD /* 9 */:
                vFrame = new Space(this.f7827a);
                break;
            case 10:
                VDraweeView vCheckBox = new VCheckBox(this.f7827a);
                vCheckBox.setButtonDrawable((Drawable) null);
                vCheckBox.setChecked(oMSDialog.style.checked);
                vFrame = vCheckBox;
                break;
        }
        if (NullChecker.a(vFrame)) {
            m9582W(vFrame, oMSDialog);
            m9583X(vFrame, oMSDialog, 0);
            vFrame.setPadding(xdl0.w((int) oMSDialog.style.paddingLeft), xdl0.w((int) oMSDialog.style.paddingTop), xdl0.w((int) oMSDialog.style.paddingRight), xdl0.w((int) oMSDialog.style.paddingBottom));
        }
        return vFrame;
    }

    /* JADX INFO: renamed from: v */
    public void m9592v(OMSAction oMSAction) {
        OMSDialog oMSDialog = this.f7837k.get(oMSAction);
        if (oMSDialog == null) {
            return;
        }
        String string = oMSDialog.type.toString();
        string.getClass();
        if (string.equals("switch_btn") || string.equals("checkbox")) {
            boolean z = oMSDialog.style.checked;
            OMSDialog oMSDialogClone = oMSDialog.clone();
            oMSDialogClone.style.checked = !z;
            this.f7837k.put(oMSAction, oMSDialogClone);
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m9593w(ViewGroup viewGroup, OMSDialog oMSDialog) {
        if (!TEnum.equals(oMSDialog.type, "button") && TextUtils.isEmpty(oMSDialog.nodes) && oMSDialog.nodesJson == null) {
            return;
        }
        if (TEnum.equals(oMSDialog.type, "vstack") || TEnum.equals(oMSDialog.type, "hstack")) {
            m9596z(viewGroup, oMSDialog);
            return;
        }
        if (TEnum.equals(oMSDialog.type, "overlap")) {
            if (TextUtils.isEmpty(oMSDialog.child) && oMSDialog.childJson == null) {
                m9595y(viewGroup, oMSDialog);
                return;
            } else {
                m9561B(viewGroup, oMSDialog);
                return;
            }
        }
        if (TEnum.equals(oMSDialog.type, "button")) {
            m9594x(viewGroup, oMSDialog);
        } else if (TEnum.equals(oMSDialog.type, "page")) {
            m9560A(viewGroup, oMSDialog);
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m9594x(ViewGroup viewGroup, OMSDialog oMSDialog) {
        TextView textView;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        List<OMSDialog> listM9578S = m9578S(oMSDialog);
        if (vwb.J(listM9578S) || listM9578S.size() <= 0) {
            return;
        }
        OMSDialog oMSDialog2 = listM9578S.get(0);
        if (TextUtils.isEmpty(oMSDialog2.src) || vwb.J(oMSDialog2.style.imageSize) || oMSDialog2.style.imageSize.size() <= 1) {
            textView = new TextView(this.f7827a);
            m9586a0(textView, listM9578S.get(0));
            m9590t(viewGroup, textView, layoutParams, new d30() { // from class: l.r950
                public final void call() {
                    OmsBaseRender.m9545e();
                }
            });
        } else {
            RelativeLayout relativeLayout = new RelativeLayout(this.f7827a);
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(xdl0.w(((Integer) oMSDialog2.style.imageSize.get(0)).intValue()), xdl0.w(((Integer) oMSDialog2.style.imageSize.get(1)).intValue()));
            VDraweeView vDraweeView = new VDraweeView(this.f7827a);
            m9584Y(vDraweeView, listM9578S.get(1), true);
            layoutParams2.addRule(15);
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
            textView = new TextView(this.f7827a);
            m9586a0(textView, listM9578S.get(0));
            int i = f7826o + 1;
            f7826o = i;
            vDraweeView.setId(i);
            layoutParams3.addRule(15);
            layoutParams3.addRule(1, f7826o);
            layoutParams3.leftMargin = xdl0.w((int) oMSDialog.style.spacing);
            relativeLayout.addView((View) vDraweeView, (ViewGroup.LayoutParams) layoutParams2);
            relativeLayout.addView(textView, layoutParams3);
            m9590t(viewGroup, relativeLayout, layoutParams, new d30() { // from class: l.q950
                public final void call() {
                    OmsBaseRender.m9542b();
                }
            });
        }
        if (listM9578S.size() > 1) {
            this.f7830d.add(new C0496c(viewGroup, textView, listM9578S, oMSDialog));
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m9595y(ViewGroup viewGroup, OMSDialog oMSDialog) {
        for (final OMSDialog oMSDialog2 : m9578S(oMSDialog)) {
            if (TEnum.equals(oMSDialog2.type, "extra")) {
                this.f7832f = oMSDialog2;
            } else {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) m9562C(GroupLayoutType.frame, oMSDialog2, viewGroup);
                final View viewM9591u = m9591u(oMSDialog2);
                layoutParams.gravity = xc50.m24768b(oMSDialog2.style.location);
                layoutParams.setMargins(xdl0.w((int) oMSDialog2.style.marginLeft), xdl0.w((int) oMSDialog2.style.marginTop), xdl0.w((int) oMSDialog2.style.marginRight), xdl0.w((int) oMSDialog2.style.marginBottom));
                m9590t(viewGroup, viewM9591u, layoutParams, new d30() { // from class: l.x950
                    public final void call() {
                        this.f22475a.m9565F(oMSDialog2, viewM9591u);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m9596z(ViewGroup viewGroup, OMSDialog oMSDialog) {
        ((LinearLayout) viewGroup).setOrientation(TEnum.equals(oMSDialog.type, "vstack") ? 1 : 0);
        for (final OMSDialog oMSDialog2 : m9578S(oMSDialog)) {
            if (TEnum.equals(oMSDialog2.type, "extra")) {
                this.f7832f = oMSDialog2;
            } else {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) m9562C(GroupLayoutType.linear, oMSDialog2, viewGroup);
                final View viewM9591u = m9591u(oMSDialog2);
                layoutParams.gravity = xc50.m24768b(oMSDialog2.style.location);
                layoutParams.setMargins(xdl0.w((int) oMSDialog2.style.marginLeft), xdl0.w((int) oMSDialog2.style.marginTop), xdl0.w((int) oMSDialog2.style.marginRight), xdl0.w((int) oMSDialog2.style.marginBottom));
                m9590t(viewGroup, viewM9591u, layoutParams, new d30() { // from class: l.w950
                    public final void call() {
                        this.f21951a.m9566G(oMSDialog2, viewM9591u);
                    }
                });
            }
        }
    }
}
