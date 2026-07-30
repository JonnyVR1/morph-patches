package com.p051p1.mobile.putong.oms;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.putong.data.OMSAction;
import com.p051p1.mobile.putong.data.OMSBaseStyle;
import com.p051p1.mobile.putong.data.OMSDialog;
import com.p051p1.mobile.putong.data.OMSDialogInfo;
import com.p051p1.mobile.putong.data.OMSLocationType;
import com.p051p1.mobile.putong.data.OMSMorphBaseStyle;
import com.p051p1.mobile.putong.data.OMSPreCondition;
import com.p051p1.mobile.putong.data.OMSSizeType;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.data.OMSUIType;
import com.p051p1.mobile.putong.data.OmsMerCuryData;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.oms.OmsBaseRender;
import com.p051p1.mobile.putong.oms.view.OmsViewPager;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import p137rx.C22421c;
import p151v.VCheckBox;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VLinear;
import p151v.VPagerCircleIndicator;
import p151v.VRelative;
import p151v.VSwitchButton;
import p151v.VText;
import p153l.b9c0;
import p153l.bnl0;
import p153l.c4k0;
import p153l.dsi0;
import p153l.el50;
import p153l.fo0;
import p153l.h1e0;
import p153l.jyb;
import p153l.kcg0;
import p153l.l4g0;
import p153l.lb2;
import p153l.pf60;
import p153l.pk50;
import p153l.psd0;
import p153l.r1j0;
import p153l.uk50;
import p153l.uqb0;
import p153l.w1e;
import p153l.w660;
import p153l.wlj;
import p153l.x20;
import p153l.y20;
import p153l.zfc0;

/* JADX INFO: loaded from: classes10.dex */
public class OmsBaseRender {

    /* JADX INFO: renamed from: o */
    public static int f55068o = 100;

    /* JADX INFO: renamed from: a */
    public Act f55069a;

    /* JADX INFO: renamed from: b */
    public OMSDialogInfo f55070b;

    /* JADX INFO: renamed from: c */
    public Dialog.C4460e f55071c;

    /* JADX INFO: renamed from: e */
    public OmsViewPager f55073e;

    /* JADX INFO: renamed from: f */
    public OMSDialog f55074f;

    /* JADX INFO: renamed from: g */
    public kcg0 f55075g;

    /* JADX INFO: renamed from: h */
    public boolean f55076h;

    /* JADX INFO: renamed from: i */
    public View f55077i;

    /* JADX INFO: renamed from: j */
    public boolean f55078j;

    /* JADX INFO: renamed from: l */
    public l4g0 f55080l;

    /* JADX INFO: renamed from: m */
    public DialogInterface.OnDismissListener f55081m;

    /* JADX INFO: renamed from: n */
    public DialogInterface.OnShowListener f55082n;

    /* JADX INFO: renamed from: d */
    public List<C13257c> f55072d = new ArrayList();

    /* JADX INFO: renamed from: k */
    public Map<OMSAction, OMSDialog> f55079k = new HashMap();

    public enum GroupLayoutType {
        linear,
        relative,
        frame
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.oms.OmsBaseRender$a */
    public class C13255a implements ViewPager.InterfaceC0718j {
        public C13255a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageScrollStateChanged(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageScrolled(int i, float f, int i2) {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageSelected(int i) {
            for (C13257c c13257c : OmsBaseRender.this.f55072d) {
                if (i >= c13257c.f55087c.size()) {
                    return;
                }
                OmsBaseRender.this.m80447X(c13257c.f55085a, c13257c.f55088d, i);
                OmsBaseRender.this.m80450a0(c13257c.f55086b, c13257c.f55087c.get(i));
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.oms.OmsBaseRender$b */
    public static /* synthetic */ class C13256b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f55084a;

        static {
            int[] iArr = new int[GroupLayoutType.values().length];
            f55084a = iArr;
            try {
                iArr[GroupLayoutType.frame.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f55084a[GroupLayoutType.relative.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.oms.OmsBaseRender$c */
    public static class C13257c {

        /* JADX INFO: renamed from: a */
        public View f55085a;

        /* JADX INFO: renamed from: b */
        public TextView f55086b;

        /* JADX INFO: renamed from: c */
        public List<OMSDialog> f55087c;

        /* JADX INFO: renamed from: d */
        public OMSDialog f55088d;

        public C13257c(View view, TextView textView, List<OMSDialog> list, OMSDialog oMSDialog) {
            this.f55085a = view;
            this.f55086b = textView;
            this.f55087c = list;
            this.f55088d = oMSDialog;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.oms.OmsBaseRender$d */
    public class C13258d extends lb2 {

        /* JADX INFO: renamed from: e */
        public List<OMSDialog> f55089e;

        public C13258d(OMSDialog oMSDialog) {
            this.f55089e = OmsBaseRender.this.m80442S(oMSDialog);
        }

        @Override // p153l.cf60
        public int getCount() {
            if (jyb.m147479J(this.f55089e)) {
                return 0;
            }
            return this.f55089e.size();
        }

        @Override // p153l.cf60
        public boolean isViewFromObject(@NonNull View view, @NonNull Object obj) {
            return view == obj;
        }

        @Override // p153l.lb2
        /* JADX INFO: renamed from: o */
        public void mo40045o(ViewGroup viewGroup, int i, Object obj) {
            viewGroup.removeView((View) obj);
        }

        @Override // p153l.lb2
        /* JADX INFO: renamed from: p */
        public Object mo40046p(ViewGroup viewGroup, int i) {
            View viewM80445V = OmsBaseRender.this.m80445V(this.f55089e.get(i));
            viewGroup.addView(viewM80445V);
            return viewM80445V;
        }
    }

    public OmsBaseRender(Act act, OMSDialogInfo oMSDialogInfo) {
        this.f55069a = act;
        this.f55070b = oMSDialogInfo;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m80406b() {
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m80409e() {
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m80415k() {
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m80417m() {
    }

    /* JADX INFO: renamed from: A */
    public final void m80424A(ViewGroup viewGroup, OMSDialog oMSDialog) {
        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        this.f55073e = new OmsViewPager(this.f55069a);
        final C13258d c13258d = new C13258d(oMSDialog);
        this.f55073e.setAdapter(c13258d);
        this.f55073e.setOffscreenPageLimit(c13258d.getCount());
        this.f55073e.setScrollble(oMSDialog.style.canSlide);
        this.f55073e.m4187d(new C13255a());
        m80454t(viewGroup, this.f55073e, layoutParams, new x20() { // from class: l.ii50
            @Override // p153l.x20
            public final void call() {
                OmsBaseRender.m80417m();
            }
        });
        if (oMSDialog.style.showIndicator) {
            VPagerCircleIndicator vPagerCircleIndicator = new VPagerCircleIndicator(this.f55069a);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
            vPagerCircleIndicator.setFillColor(Color.parseColor(oMSDialog.style.indicatorColor));
            vPagerCircleIndicator.setRadius(bnl0.m105587w(oMSDialog.style.indicatorRadius));
            vPagerCircleIndicator.setPageColor(Color.parseColor(oMSDialog.style.indicatorBgColor));
            vPagerCircleIndicator.setOrientation(TEnum.equals(oMSDialog.style.direction, ResourceDirection.f39656v) ? 1 : 0);
            OmsViewPager omsViewPager = this.f55073e;
            vPagerCircleIndicator.m224389c(omsViewPager, omsViewPager.getCurrentItem());
            layoutParams2.gravity = 1;
            m80454t(viewGroup, vPagerCircleIndicator, layoutParams2, new x20() { // from class: l.vh50
                @Override // p153l.x20
                public final void call() {
                    OmsBaseRender.m80415k();
                }
            });
        }
        OMSBaseStyle oMSBaseStyle = oMSDialog.style;
        if (oMSBaseStyle.autoSwitch) {
            this.f55075g = C22421c.interval(oMSBaseStyle.autoSwitchTime, TimeUnit.MILLISECONDS).onBackpressureLatest().observeOn(fo0.m126432a()).subscribe(psd0.m173596G(new y20() { // from class: l.wh50
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f189084a.m80431H(c13258d, (Long) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: B */
    public final void m80425B(ViewGroup viewGroup, OMSDialog oMSDialog) {
        f55068o++;
        final OMSDialog oMSDialogM80443T = m80443T(oMSDialog);
        final View viewM80455u = m80455u(oMSDialogM80443T);
        if (NullChecker.m82486a(viewM80455u)) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) m80426C(GroupLayoutType.relative, oMSDialogM80443T, viewGroup);
            layoutParams.setMargins(bnl0.m105587w((int) oMSDialogM80443T.style.marginLeft), bnl0.m105587w((int) oMSDialogM80443T.style.marginTop), bnl0.m105587w((int) oMSDialogM80443T.style.marginRight), bnl0.m105587w((int) oMSDialogM80443T.style.marginBottom));
            viewM80455u.setId(f55068o);
            Iterator<OMSLocationType> it = oMSDialogM80443T.style.location.iterator();
            while (it.hasNext()) {
                layoutParams.addRule(el50.m121102e(it.next()));
            }
            m80454t(viewGroup, viewM80455u, layoutParams, new x20() { // from class: l.fi50
                @Override // p153l.x20
                public final void call() {
                    this.f99151a.m80432I(oMSDialogM80443T, viewM80455u);
                }
            });
        }
        for (final OMSDialog oMSDialog2 : m80442S(oMSDialog)) {
            if (TEnum.equals(oMSDialog2.type, "extra")) {
                this.f55074f = oMSDialog2;
            } else {
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) m80426C(GroupLayoutType.relative, oMSDialog2, viewGroup);
                final View viewM80455u2 = m80455u(oMSDialog2);
                layoutParams2.setMargins(bnl0.m105587w((int) oMSDialog2.style.marginLeft), bnl0.m105587w((int) oMSDialog2.style.marginTop), bnl0.m105587w((int) oMSDialog2.style.marginRight), bnl0.m105587w((int) oMSDialog2.style.marginBottom));
                for (OMSLocationType oMSLocationType : oMSDialog2.style.location) {
                    if (oMSDialog2.needApplyChild) {
                        layoutParams2.addRule(el50.m121102e(oMSLocationType), f55068o);
                    } else {
                        layoutParams2.addRule(el50.m121102e(oMSLocationType));
                    }
                }
                m80454t(viewGroup, viewM80455u2, layoutParams2, new x20() { // from class: l.gi50
                    @Override // p153l.x20
                    public final void call() {
                        this.f104202a.m80433J(oMSDialog2, viewM80455u2);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: C */
    public final ViewGroup.LayoutParams m80426C(GroupLayoutType groupLayoutType, OMSDialog oMSDialog, ViewGroup viewGroup) {
        int iM80427D;
        int iM80427D2;
        boolean zEquals = TEnum.equals(oMSDialog.style.widthType, OMSSizeType.ratio);
        OMSBaseStyle oMSBaseStyle = oMSDialog.style;
        if (zEquals) {
            OMSSizeType oMSSizeType = oMSBaseStyle.heightType;
            int i = (int) oMSBaseStyle.height;
            float f = oMSBaseStyle.width;
            iM80427D = m80427D(oMSSizeType, i, f > 0.0f ? (int) f : viewGroup.getWidth(), oMSDialog.style.ratio);
            OMSBaseStyle oMSBaseStyle2 = oMSDialog.style;
            OMSSizeType oMSSizeType2 = oMSBaseStyle2.widthType;
            int i2 = (int) oMSBaseStyle2.width;
            float f2 = oMSBaseStyle2.height;
            iM80427D2 = m80427D(oMSSizeType2, i2, f2 > 0.0f ? (int) f2 : viewGroup.getHeight(), oMSDialog.style.ratio);
        } else {
            OMSSizeType oMSSizeType3 = oMSBaseStyle.widthType;
            int i3 = (int) oMSBaseStyle.width;
            float f3 = oMSBaseStyle.height;
            int iM80427D3 = m80427D(oMSSizeType3, i3, f3 > 0.0f ? (int) f3 : viewGroup.getHeight(), oMSDialog.style.ratio);
            OMSBaseStyle oMSBaseStyle3 = oMSDialog.style;
            OMSSizeType oMSSizeType4 = oMSBaseStyle3.heightType;
            int i4 = (int) oMSBaseStyle3.height;
            float f4 = oMSBaseStyle3.width;
            iM80427D = m80427D(oMSSizeType4, i4, f4 > 0.0f ? (int) f4 : viewGroup.getWidth(), oMSDialog.style.ratio);
            iM80427D2 = iM80427D3;
        }
        if (TEnum.equals(oMSDialog.type, OMSTemplateModeType.page)) {
            iM80427D = -2;
        }
        int i5 = C13256b.f55084a[groupLayoutType.ordinal()];
        if (i5 != 1) {
            return i5 != 2 ? new LinearLayout.LayoutParams(iM80427D2, iM80427D) : new RelativeLayout.LayoutParams(iM80427D2, iM80427D);
        }
        return new FrameLayout.LayoutParams(iM80427D2, iM80427D);
    }

    /* JADX INFO: renamed from: D */
    public final int m80427D(OMSSizeType oMSSizeType, int i, int i2, float f) {
        String string = oMSSizeType.toString();
        string.getClass();
        switch (string) {
            case "ratio":
                return (int) (bnl0.m105587w(i2) * f);
            case "wrap_content":
                return -2;
            case "match_parent":
                return -1;
            default:
                return bnl0.m105587w(i);
        }
    }

    /* JADX INFO: renamed from: E */
    public final boolean m80428E(OMSTemplateModeType oMSTemplateModeType) {
        return TEnum.equals(oMSTemplateModeType, OMSTemplateModeType.hstack) || TEnum.equals(oMSTemplateModeType, OMSTemplateModeType.vstack) || TEnum.equals(oMSTemplateModeType, "overlap") || TEnum.equals(oMSTemplateModeType, "button") || TEnum.equals(oMSTemplateModeType, OMSTemplateModeType.page);
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m80429F(OMSDialog oMSDialog, View view) {
        if (m80428E(oMSDialog.type)) {
            m80457w((ViewGroup) view, oMSDialog);
        }
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m80430G(OMSDialog oMSDialog, View view) {
        if (m80428E(oMSDialog.type)) {
            m80457w((ViewGroup) view, oMSDialog);
        }
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m80431H(C13258d c13258d, Long l2) {
        int currentItem = this.f55073e.getCurrentItem();
        int size = c13258d.f55089e.size() - 1;
        OmsViewPager omsViewPager = this.f55073e;
        if (currentItem == size) {
            omsViewPager.m4178T(0, true);
        } else {
            omsViewPager.m4178T(omsViewPager.getCurrentItem() + 1, true);
        }
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m80432I(OMSDialog oMSDialog, View view) {
        if (m80428E(oMSDialog.type)) {
            m80457w((ViewGroup) view, oMSDialog);
        }
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m80433J(OMSDialog oMSDialog, View view) {
        if (m80428E(oMSDialog.type)) {
            m80457w((ViewGroup) view, oMSDialog);
        }
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m80434K(OMSDialog oMSDialog, View view) {
        if (m80428E(oMSDialog.type)) {
            m80457w((ViewGroup) view, oMSDialog);
        }
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m80435L(View view, Bitmap bitmap) {
        if (view == null || bitmap.isRecycled()) {
            return;
        }
        view.setBackground(new BitmapDrawable(this.f55069a.getResources(), bitmap));
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m80436M(final View view, OMSDialog oMSDialog, final Bitmap bitmap) {
        if (NullChecker.m82486a(bitmap)) {
            this.f55069a.runOnUiThread(new Runnable() { // from class: l.zh50
                @Override // java.lang.Runnable
                public final void run() {
                    this.f204377a.m80435L(view, bitmap);
                }
            });
            return;
        }
        CrashHelper.m82480d(new RuntimeException("OMSDialogRender identifer:" + this.f55070b.identifier + " bgUrl:" + oMSDialog.bgImage), 100);
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m80437N(OMSDialog oMSDialog, int i, View view) {
        boolean z;
        boolean z2;
        if (jyb.m147479J(uk50.m196472f().m196474b())) {
            return;
        }
        OMSAction oMSAction = oMSDialog.actions.get(i);
        Iterator<c4k0> it = uk50.m196472f().m196474b().iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                z2 = false;
                break;
            } else if (it.next().m107885a(oMSAction, this)) {
                z = true;
                z2 = !jyb.m147479J(oMSAction.preCondition);
                break;
            }
        }
        if (!z) {
            new w660().m107887e(this).mo106291c(oMSDialog.actions.get(i));
        }
        if (z2 || TextUtils.isEmpty(oMSDialog.mercury.f39648id)) {
            return;
        }
        OmsMerCuryData omsMerCuryData = oMSDialog.mercury;
        el50.m121104g(omsMerCuryData.f39648id, this.f55070b.mercury.f39648id, omsMerCuryData.server);
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m80438O(DialogInterface dialogInterface) {
        m80449Z();
        w1e.m204402f(this.f55080l);
        DialogInterface.OnShowListener onShowListener = this.f55082n;
        if (onShowListener != null) {
            onShowListener.onShow(dialogInterface);
        }
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m80439P(DialogInterface dialogInterface) {
        psd0.m173633z(this.f55075g);
        w1e.m204401e(this.f55080l);
        uk50.m196472f().m196480i();
        DialogInterface.OnDismissListener onDismissListener = this.f55081m;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(dialogInterface);
        }
    }

    /* JADX INFO: renamed from: Q */
    public void m80440Q() {
        if (this.f55069a.isFinishing() || this.f55069a.isDestroyed() || this.f55071c.m21528Y() == null || !this.f55071c.m21528Y().isShowing()) {
            return;
        }
        psd0.m173633z(this.f55075g);
        w1e.m204401e(this.f55080l);
        this.f55071c.m21528Y().dismiss();
    }

    /* JADX INFO: renamed from: R */
    public void m80441R() {
        this.f55071c = this.f55069a.dialog();
        this.f55077i = m80445V(this.f55070b.content.morph);
    }

    /* JADX INFO: renamed from: S */
    public final List<OMSDialog> m80442S(OMSDialog oMSDialog) {
        ArrayList arrayList = new ArrayList();
        List<OMSDialog> list = oMSDialog.nodesJson;
        if (list != null) {
            return list;
        }
        try {
            JSONArray jSONArray = new JSONArray(oMSDialog.nodes);
            for (int i = 0; i < jSONArray.length(); i++) {
                arrayList.add(OMSDialog.JSON_ADAPTER.parse(jSONArray.getString(i)));
            }
        } catch (IOException | JSONException e) {
            CrashHelper.m82479c(e);
            this.f55076h = true;
            e.toString();
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: T */
    public final OMSDialog m80443T(OMSDialog oMSDialog) {
        OMSDialog oMSDialog2 = oMSDialog.childJson;
        if (oMSDialog2 != null) {
            return oMSDialog2;
        }
        try {
            return OMSDialog.JSON_ADAPTER.parse(oMSDialog.child);
        } catch (IOException e) {
            CrashHelper.m82479c(e);
            this.f55076h = true;
            e.toString();
            return null;
        }
    }

    /* JADX INFO: renamed from: U */
    public void m80444U(String str) {
        OMSDialog value;
        Iterator<Map.Entry<OMSAction, OMSDialog>> it = this.f55079k.entrySet().iterator();
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
        List<OMSPreCondition> list = value.actions.get(0).preCondition;
        value.actions.get(0).preCondition = null;
        if (!jyb.m147479J(uk50.m196472f().m196474b())) {
            Iterator<c4k0> it2 = uk50.m196472f().m196474b().iterator();
            while (it2.hasNext()) {
                if (it2.next().m107885a(value.actions.get(0), this)) {
                }
            }
            new w660().m107887e(this).mo106291c(value.actions.get(0));
        }
        value.actions.get(0).preCondition = list;
    }

    /* JADX INFO: renamed from: V */
    public View m80445V(final OMSDialog oMSDialog) {
        ViewGroup frameLayout = new FrameLayout(this.f55069a);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) m80426C(GroupLayoutType.frame, oMSDialog, frameLayout);
        final View viewM80455u = m80455u(oMSDialog);
        layoutParams.setMargins(bnl0.m105587w((int) oMSDialog.style.marginLeft), bnl0.m105587w((int) oMSDialog.style.marginTop), bnl0.m105587w((int) oMSDialog.style.marginRight), bnl0.m105587w((int) oMSDialog.style.marginBottom));
        m80454t(frameLayout, viewM80455u, layoutParams, new x20() { // from class: l.uh50
            @Override // p153l.x20
            public final void call() {
                this.f178992a.m80434K(oMSDialog, viewM80455u);
            }
        });
        return frameLayout;
    }

    /* JADX INFO: renamed from: W */
    public final void m80446W(final View view, final OMSDialog oMSDialog) {
        if (!TextUtils.isEmpty(oMSDialog.bgImage)) {
            String strM117767g = dsi0.m117767g(oMSDialog.bgImage);
            if (pk50.m172568j().m172575g().m186055a(strM117767g)) {
                view.setBackgroundResource(pk50.m172568j().m172575g().m186056b(strM117767g).intValue());
                return;
            } else {
                uqb0.f180374G.m127108I(strM117767g, new y20() { // from class: l.ci50
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f81895a.m80436M(view, oMSDialog, (Bitmap) obj);
                    }
                });
                return;
            }
        }
        if (jyb.m147479J(oMSDialog.style.bgColors)) {
            return;
        }
        int size = oMSDialog.style.bgColors.size() == 1 ? 2 : oMSDialog.style.bgColors.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            int size2 = oMSDialog.style.bgColors.size();
            OMSBaseStyle oMSBaseStyle = oMSDialog.style;
            if (i >= size2) {
                iArr[i] = Color.parseColor(oMSBaseStyle.bgColors.get(0));
            } else {
                iArr[i] = Color.parseColor(oMSBaseStyle.bgColors.get(i));
            }
        }
        GradientDrawable gradientDrawable = new GradientDrawable(TEnum.equals(oMSDialog.style.bgColorsDirection, "h") ? GradientDrawable.Orientation.LEFT_RIGHT : GradientDrawable.Orientation.TOP_BOTTOM, iArr);
        if (oMSDialog.style.cornerRadius > 0.0f) {
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius(oMSDialog.style.cornerRadius);
        }
        OMSBaseStyle oMSBaseStyle2 = oMSDialog.style;
        if (oMSBaseStyle2.borderWidth > 0.0f && !TextUtils.isEmpty(oMSBaseStyle2.borderColor)) {
            gradientDrawable.setStroke(bnl0.m105587w(oMSDialog.style.borderWidth), Color.parseColor(oMSDialog.style.borderColor));
        }
        view.setBackground(gradientDrawable);
    }

    /* JADX INFO: renamed from: X */
    public final void m80447X(View view, final OMSDialog oMSDialog, final int i) {
        if (!NullChecker.m82486a(oMSDialog.actions) || oMSDialog.actions.size() <= 0) {
            return;
        }
        this.f55079k.put(oMSDialog.actions.get(i), oMSDialog);
        view.setOnClickListener(new View.OnClickListener() { // from class: l.hi50
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f109984a.m80437N(oMSDialog, i, view2);
            }
        });
    }

    /* JADX INFO: renamed from: Y */
    public final void m80448Y(VDraweeView vDraweeView, OMSDialog oMSDialog, boolean z) {
        h1e0 h1e0VarM121101d = el50.m121101d(oMSDialog.style.scaleType);
        wlj wljVar = (wlj) vDraweeView.getHierarchy();
        if (NullChecker.m82486a(h1e0VarM121101d)) {
            wljVar.m207062w(h1e0VarM121101d);
        }
        float f = oMSDialog.style.cornerRadius;
        if (f > 0.0f) {
            wljVar.m207045H(RoundingParams.m8303c(f));
        }
        String strM117767g = dsi0.m117767g(z ? oMSDialog.image : oMSDialog.src);
        if (!TextUtils.isEmpty(oMSDialog.foreImage)) {
            vDraweeView.setForeground(this.f55069a.getDrawable(pk50.m172568j().m172575g().m186056b(dsi0.m117767g(oMSDialog.foreImage)).intValue()));
        }
        if (pk50.m172568j().m172575g().m186055a(strM117767g)) {
            vDraweeView.setImageResource(pk50.m172568j().m172575g().m186056b(strM117767g).intValue());
        } else if (!TextUtils.isEmpty(strM117767g)) {
            float f2 = oMSDialog.style.blurRadius;
            if (f2 == 0.0f) {
                uqb0.f180374G.m127115L0(vDraweeView, strM117767g);
            } else {
                uqb0.f180374G.m127120O(vDraweeView, strM117767g, 4, (int) f2);
            }
        }
        OMSBaseStyle oMSBaseStyle = oMSDialog.style;
        if (oMSBaseStyle.borderWidth <= 0.0f || TextUtils.isEmpty(oMSBaseStyle.borderColor)) {
            return;
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setStroke(bnl0.m105587w(oMSDialog.style.borderWidth), Color.parseColor(oMSDialog.style.borderColor));
        vDraweeView.setBackground(gradientDrawable);
    }

    /* JADX INFO: renamed from: Z */
    public boolean m80449Z() {
        if (!NullChecker.m82486a(this.f55074f)) {
            return false;
        }
        m80450a0(this.f55071c.m21528Y().f16138x, this.f55074f);
        m80447X(this.f55071c.m21528Y().f16138x, this.f55074f, 0);
        return true;
    }

    /* JADX INFO: renamed from: a0 */
    public final void m80450a0(TextView textView, OMSDialog oMSDialog) {
        Act act = this.f55069a;
        OMSDialogInfo oMSDialogInfo = this.f55070b;
        pf60<SpannableStringBuilder, Boolean> pf60VarM117766f = dsi0.m117766f(act, oMSDialogInfo.needLanguage ? dsi0.m117764d(oMSDialogInfo, oMSDialog) : oMSDialog.content, 1.0d, null);
        if (!TEnum.equals(oMSDialog.style.alignment, "unknown_")) {
            textView.setGravity(el50.m121100c(oMSDialog.style.alignment));
        }
        textView.setText(pf60VarM117766f.f152156a);
        textView.setLineSpacing(oMSDialog.style.lineSpacing, 1.0f);
        if (pf60VarM117766f.f152157b.booleanValue()) {
            textView.setMovementMethod(LinkMovementMethod.getInstance());
        }
        if (IntlCountryCodeController.m29123t()) {
            textView.setMaxLines(8);
        } else {
            textView.setMaxLines(4);
        }
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setHighlightColor(textView.getResources().getColor(b9c0.f75569o));
    }

    /* JADX INFO: renamed from: b0 */
    public void m80451b0(DialogInterface.OnDismissListener onDismissListener) {
        this.f55081m = onDismissListener;
    }

    /* JADX INFO: renamed from: c0 */
    public void m80452c0() {
        this.f55071c = this.f55069a.dialog();
        this.f55080l = w1e.m204399c(this.f55070b.mercury.f39648id, this.f55077i.getClass().getName());
        if (NullChecker.m82486a(this.f55070b.mercury.server) && this.f55070b.mercury.server.size() > 0) {
            pf60[] pf60VarArr = new pf60[this.f55070b.mercury.server.size()];
            int i = 0;
            for (Map.Entry<String, String> entry : this.f55070b.mercury.server.entrySet()) {
                pf60VarArr[i] = new pf60(entry.getKey(), dsi0.m117767g(entry.getValue()));
                i++;
            }
            this.f55080l.m152781p(pf60VarArr);
        }
        if (NullChecker.m82486a(this.f55074f)) {
            this.f55071c.m21551r0("temp");
        }
        this.f55071c.m21495B(this.f55070b.cancelAble).m21519P(this.f55077i, false).m21496B0(new DialogInterface.OnShowListener() { // from class: l.ai50
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                this.f71455a.m80438O(dialogInterface);
            }
        }).m21525V(new DialogInterface.OnDismissListener() { // from class: l.bi50
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f76838a.m80439P(dialogInterface);
            }
        });
        if (TEnum.equals(this.f55070b.content.morph.baseStyle, OMSMorphBaseStyle.bigScreen)) {
            this.f55071c.m21520Q().m21515L(zfc0.f204124j);
        } else {
            boolean zEquals = TEnum.equals(this.f55070b.content.morph.style.uiType, OMSUIType.new_type);
            Dialog.C4460e c4460e = this.f55071c;
            if (zEquals) {
                c4460e.m21515L(zfc0.f204120f);
            } else {
                c4460e.m21556u();
            }
        }
        uk50.m196472f().m196481j(this);
        this.f55071c.m21567z0();
    }

    /* JADX INFO: renamed from: d0 */
    public void m80453d0(String str) {
        OMSDialogInfo oMSDialogInfo = this.f55070b;
        if (oMSDialogInfo.needLanguage) {
            str = dsi0.m117765e(oMSDialogInfo, str);
        }
        r1j0.m179420g(str);
    }

    /* JADX INFO: renamed from: t */
    public final void m80454t(ViewGroup viewGroup, View view, ViewGroup.LayoutParams layoutParams, x20 x20Var) {
        if (view == null) {
            this.f55076h = true;
        } else {
            viewGroup.addView(view, layoutParams);
            x20Var.call();
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: u */
    public final View m80455u(OMSDialog oMSDialog) {
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
                if (string.equals(OMSTemplateModeType.hstack)) {
                    b = 1;
                }
                break;
            case -1091287993:
                if (string.equals("overlap")) {
                    b = 2;
                }
                break;
            case -806970414:
                if (string.equals(OMSTemplateModeType.vstack)) {
                    b = 3;
                }
                break;
            case -346969391:
                if (string.equals(OMSTemplateModeType.switch_btn)) {
                    b = 4;
                }
                break;
            case 3433103:
                if (string.equals(OMSTemplateModeType.page)) {
                    b = 5;
                }
                break;
            case 3556653:
                if (string.equals("text")) {
                    b = 6;
                }
                break;
            case 3619493:
                if (string.equals(OMSTemplateModeType.view)) {
                    b = 7;
                }
                break;
            case 100313435:
                if (string.equals("image")) {
                    b = 8;
                }
                break;
            case 109637894:
                if (string.equals(OMSTemplateModeType.space)) {
                    b = 9;
                }
                break;
            case 1536891843:
                if (string.equals(OMSTemplateModeType.checkbox)) {
                    b = 10;
                }
                break;
        }
        View vFrame = null;
        switch (b) {
            case 0:
                vFrame = new VFrame(this.f55069a);
                break;
            case 1:
            case 3:
                VLinear vLinear = new VLinear(this.f55069a);
                vLinear.setGravity(el50.m121100c(oMSDialog.style.alignment));
                vFrame = vLinear;
                break;
            case 2:
                vFrame = (!TextUtils.isEmpty(oMSDialog.child) || oMSDialog.childJson != null) ? new VRelative(this.f55069a) : new VFrame(this.f55069a);
                break;
            case 4:
                VSwitchButton vSwitchButton = new VSwitchButton(this.f55069a);
                vSwitchButton.setChecked(oMSDialog.style.checked);
                vFrame = vSwitchButton;
                break;
            case 5:
                LinearLayout linearLayout = new LinearLayout(this.f55069a);
                linearLayout.setOrientation(1);
                vFrame = linearLayout;
                break;
            case 6:
                TextView vText = new VText(this.f55069a);
                m80450a0(vText, oMSDialog);
                vFrame = vText;
                break;
            case 7:
                vFrame = new View(this.f55069a);
                break;
            case 8:
                VDraweeView vDraweeView = new VDraweeView(this.f55069a);
                m80448Y(vDraweeView, oMSDialog, false);
                vFrame = vDraweeView;
                break;
            case 9:
                vFrame = new Space(this.f55069a);
                break;
            case 10:
                VCheckBox vCheckBox = new VCheckBox(this.f55069a);
                vCheckBox.setButtonDrawable((Drawable) null);
                vCheckBox.setChecked(oMSDialog.style.checked);
                vFrame = vCheckBox;
                break;
        }
        if (NullChecker.m82486a(vFrame)) {
            m80446W(vFrame, oMSDialog);
            m80447X(vFrame, oMSDialog, 0);
            vFrame.setPadding(bnl0.m105587w((int) oMSDialog.style.paddingLeft), bnl0.m105587w((int) oMSDialog.style.paddingTop), bnl0.m105587w((int) oMSDialog.style.paddingRight), bnl0.m105587w((int) oMSDialog.style.paddingBottom));
        }
        return vFrame;
    }

    /* JADX INFO: renamed from: v */
    public void m80456v(OMSAction oMSAction) {
        OMSDialog oMSDialog = this.f55079k.get(oMSAction);
        if (oMSDialog == null) {
            return;
        }
        String string = oMSDialog.type.toString();
        string.getClass();
        if (string.equals(OMSTemplateModeType.switch_btn) || string.equals(OMSTemplateModeType.checkbox)) {
            boolean z = oMSDialog.style.checked;
            OMSDialog oMSDialogMo225055clone = oMSDialog.mo225055clone();
            oMSDialogMo225055clone.style.checked = !z;
            this.f55079k.put(oMSAction, oMSDialogMo225055clone);
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m80457w(ViewGroup viewGroup, OMSDialog oMSDialog) {
        if (!TEnum.equals(oMSDialog.type, "button") && TextUtils.isEmpty(oMSDialog.nodes) && oMSDialog.nodesJson == null) {
            return;
        }
        if (TEnum.equals(oMSDialog.type, OMSTemplateModeType.vstack) || TEnum.equals(oMSDialog.type, OMSTemplateModeType.hstack)) {
            m80460z(viewGroup, oMSDialog);
            return;
        }
        if (TEnum.equals(oMSDialog.type, "overlap")) {
            if (TextUtils.isEmpty(oMSDialog.child) && oMSDialog.childJson == null) {
                m80459y(viewGroup, oMSDialog);
                return;
            } else {
                m80425B(viewGroup, oMSDialog);
                return;
            }
        }
        if (TEnum.equals(oMSDialog.type, "button")) {
            m80458x(viewGroup, oMSDialog);
        } else if (TEnum.equals(oMSDialog.type, OMSTemplateModeType.page)) {
            m80424A(viewGroup, oMSDialog);
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m80458x(ViewGroup viewGroup, OMSDialog oMSDialog) {
        TextView textView;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        List<OMSDialog> listM80442S = m80442S(oMSDialog);
        if (jyb.m147479J(listM80442S) || listM80442S.size() <= 0) {
            return;
        }
        OMSDialog oMSDialog2 = listM80442S.get(0);
        if (TextUtils.isEmpty(oMSDialog2.src) || jyb.m147479J(oMSDialog2.style.imageSize) || oMSDialog2.style.imageSize.size() <= 1) {
            textView = new TextView(this.f55069a);
            m80450a0(textView, listM80442S.get(0));
            m80454t(viewGroup, textView, layoutParams, new x20() { // from class: l.yh50
                @Override // p153l.x20
                public final void call() {
                    OmsBaseRender.m80409e();
                }
            });
        } else {
            RelativeLayout relativeLayout = new RelativeLayout(this.f55069a);
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(bnl0.m105587w(oMSDialog2.style.imageSize.get(0).intValue()), bnl0.m105587w(oMSDialog2.style.imageSize.get(1).intValue()));
            VDraweeView vDraweeView = new VDraweeView(this.f55069a);
            m80448Y(vDraweeView, listM80442S.get(1), true);
            layoutParams2.addRule(15);
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
            textView = new TextView(this.f55069a);
            m80450a0(textView, listM80442S.get(0));
            int i = f55068o + 1;
            f55068o = i;
            vDraweeView.setId(i);
            layoutParams3.addRule(15);
            layoutParams3.addRule(1, f55068o);
            layoutParams3.leftMargin = bnl0.m105587w((int) oMSDialog.style.spacing);
            relativeLayout.addView(vDraweeView, layoutParams2);
            relativeLayout.addView(textView, layoutParams3);
            m80454t(viewGroup, relativeLayout, layoutParams, new x20() { // from class: l.xh50
                @Override // p153l.x20
                public final void call() {
                    OmsBaseRender.m80406b();
                }
            });
        }
        if (listM80442S.size() > 1) {
            this.f55072d.add(new C13257c(viewGroup, textView, listM80442S, oMSDialog));
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m80459y(ViewGroup viewGroup, OMSDialog oMSDialog) {
        for (final OMSDialog oMSDialog2 : m80442S(oMSDialog)) {
            if (TEnum.equals(oMSDialog2.type, "extra")) {
                this.f55074f = oMSDialog2;
            } else {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) m80426C(GroupLayoutType.frame, oMSDialog2, viewGroup);
                final View viewM80455u = m80455u(oMSDialog2);
                layoutParams.gravity = el50.m121099b(oMSDialog2.style.location);
                layoutParams.setMargins(bnl0.m105587w((int) oMSDialog2.style.marginLeft), bnl0.m105587w((int) oMSDialog2.style.marginTop), bnl0.m105587w((int) oMSDialog2.style.marginRight), bnl0.m105587w((int) oMSDialog2.style.marginBottom));
                m80454t(viewGroup, viewM80455u, layoutParams, new x20() { // from class: l.ei50
                    @Override // p153l.x20
                    public final void call() {
                        this.f94106a.m80429F(oMSDialog2, viewM80455u);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m80460z(ViewGroup viewGroup, OMSDialog oMSDialog) {
        ((LinearLayout) viewGroup).setOrientation(TEnum.equals(oMSDialog.type, OMSTemplateModeType.vstack) ? 1 : 0);
        for (final OMSDialog oMSDialog2 : m80442S(oMSDialog)) {
            if (TEnum.equals(oMSDialog2.type, "extra")) {
                this.f55074f = oMSDialog2;
            } else {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) m80426C(GroupLayoutType.linear, oMSDialog2, viewGroup);
                final View viewM80455u = m80455u(oMSDialog2);
                layoutParams.gravity = el50.m121099b(oMSDialog2.style.location);
                layoutParams.setMargins(bnl0.m105587w((int) oMSDialog2.style.marginLeft), bnl0.m105587w((int) oMSDialog2.style.marginTop), bnl0.m105587w((int) oMSDialog2.style.marginRight), bnl0.m105587w((int) oMSDialog2.style.marginBottom));
                m80454t(viewGroup, viewM80455u, layoutParams, new x20() { // from class: l.di50
                    @Override // p153l.x20
                    public final void call() {
                        this.f88586a.m80430G(oMSDialog2, viewM80455u);
                    }
                });
            }
        }
    }
}
