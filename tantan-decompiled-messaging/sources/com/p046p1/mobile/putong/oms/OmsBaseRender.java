package com.p046p1.mobile.putong.oms;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.putong.data.OMSAction;
import com.p046p1.mobile.putong.data.OMSBaseStyle;
import com.p046p1.mobile.putong.data.OMSDialog;
import com.p046p1.mobile.putong.data.OMSDialogInfo;
import com.p046p1.mobile.putong.data.OMSLocationType;
import com.p046p1.mobile.putong.data.OMSMorphBaseStyle;
import com.p046p1.mobile.putong.data.OMSPreCondition;
import com.p046p1.mobile.putong.data.OMSSizeType;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p046p1.mobile.putong.data.OMSUIType;
import com.p046p1.mobile.putong.data.OmsMerCuryData;
import com.p046p1.mobile.putong.data.ResourceDirection;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.oms.OmsBaseRender;
import com.p046p1.mobile.putong.oms.view.OmsViewPager;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;
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
import p133rx.C22306c;
import p147v.VCheckBox;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VLinear;
import p147v.VPagerCircleIndicator;
import p147v.VRelative;
import p147v.VSwitchButton;
import p147v.VText;
import p149l.c4g0;
import p149l.cwf0;
import p149l.d30;
import p149l.dji0;
import p149l.djj;
import p149l.e30;
import p149l.eb2;
import p149l.ftd0;
import p149l.i0e;
import p149l.ic50;
import p149l.j760;
import p149l.jo0;
import p149l.mkd0;
import p149l.nc50;
import p149l.osi0;
import p149l.qib0;
import p149l.ry50;
import p149l.u7c0;
import p149l.v0c0;
import p149l.vwb;
import p149l.xc50;
import p149l.xdl0;
import p149l.zuj0;

/* JADX INFO: loaded from: classes11.dex */
public class OmsBaseRender {

    /* JADX INFO: renamed from: o */
    public static int f54220o = 100;

    /* JADX INFO: renamed from: a */
    public Act f54221a;

    /* JADX INFO: renamed from: b */
    public OMSDialogInfo f54222b;

    /* JADX INFO: renamed from: c */
    public Dialog.C4309e f54223c;

    /* JADX INFO: renamed from: e */
    public OmsViewPager f54225e;

    /* JADX INFO: renamed from: f */
    public OMSDialog f54226f;

    /* JADX INFO: renamed from: g */
    public c4g0 f54227g;

    /* JADX INFO: renamed from: h */
    public boolean f54228h;

    /* JADX INFO: renamed from: i */
    public View f54229i;

    /* JADX INFO: renamed from: j */
    public boolean f54230j;

    /* JADX INFO: renamed from: l */
    public cwf0 f54232l;

    /* JADX INFO: renamed from: m */
    public DialogInterface.OnDismissListener f54233m;

    /* JADX INFO: renamed from: n */
    public DialogInterface.OnShowListener f54234n;

    /* JADX INFO: renamed from: d */
    public List<C13094c> f54224d = new ArrayList();

    /* JADX INFO: renamed from: k */
    public Map<OMSAction, OMSDialog> f54231k = new HashMap();

    public enum GroupLayoutType {
        linear,
        relative,
        frame
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.oms.OmsBaseRender$a */
    public class C13092a implements ViewPager.InterfaceC0716j {
        public C13092a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageScrollStateChanged(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageScrolled(int i, float f, int i2) {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageSelected(int i) {
            for (C13094c c13094c : OmsBaseRender.this.f54224d) {
                if (i >= c13094c.f54239c.size()) {
                    return;
                }
                OmsBaseRender.this.m79264X(c13094c.f54237a, c13094c.f54240d, i);
                OmsBaseRender.this.m79267a0(c13094c.f54238b, c13094c.f54239c.get(i));
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.oms.OmsBaseRender$b */
    public static /* synthetic */ class C13093b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f54236a;

        static {
            int[] iArr = new int[GroupLayoutType.values().length];
            f54236a = iArr;
            try {
                iArr[GroupLayoutType.frame.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f54236a[GroupLayoutType.relative.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.oms.OmsBaseRender$c */
    public static class C13094c {

        /* JADX INFO: renamed from: a */
        public View f54237a;

        /* JADX INFO: renamed from: b */
        public TextView f54238b;

        /* JADX INFO: renamed from: c */
        public List<OMSDialog> f54239c;

        /* JADX INFO: renamed from: d */
        public OMSDialog f54240d;

        public C13094c(View view, TextView textView, List<OMSDialog> list, OMSDialog oMSDialog) {
            this.f54237a = view;
            this.f54238b = textView;
            this.f54239c = list;
            this.f54240d = oMSDialog;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.oms.OmsBaseRender$d */
    public class C13095d extends eb2 {

        /* JADX INFO: renamed from: e */
        public List<OMSDialog> f54241e;

        public C13095d(OMSDialog oMSDialog) {
            this.f54241e = OmsBaseRender.this.m79259S(oMSDialog);
        }

        @Override // p149l.w660
        public int getCount() {
            if (vwb.m200296J(this.f54241e)) {
                return 0;
            }
            return this.f54241e.size();
        }

        @Override // p149l.w660
        public boolean isViewFromObject(@NonNull View view, @NonNull Object obj) {
            return view == obj;
        }

        @Override // p149l.eb2
        /* JADX INFO: renamed from: o */
        public void mo39042o(ViewGroup viewGroup, int i, Object obj) {
            viewGroup.removeView((View) obj);
        }

        @Override // p149l.eb2
        /* JADX INFO: renamed from: p */
        public Object mo39043p(ViewGroup viewGroup, int i) {
            View viewM79262V = OmsBaseRender.this.m79262V(this.f54241e.get(i));
            viewGroup.addView(viewM79262V);
            return viewM79262V;
        }
    }

    public OmsBaseRender(Act act, OMSDialogInfo oMSDialogInfo) {
        this.f54221a = act;
        this.f54222b = oMSDialogInfo;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m79223b() {
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m79226e() {
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m79232k() {
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m79234m() {
    }

    /* JADX INFO: renamed from: A */
    public final void m79241A(ViewGroup viewGroup, OMSDialog oMSDialog) {
        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        this.f54225e = new OmsViewPager(this.f54221a);
        final C13095d c13095d = new C13095d(oMSDialog);
        this.f54225e.setAdapter(c13095d);
        this.f54225e.setOffscreenPageLimit(c13095d.getCount());
        this.f54225e.setScrollble(oMSDialog.style.canSlide);
        this.f54225e.m4185d(new C13092a());
        m79271t(viewGroup, this.f54225e, layoutParams, new d30() { // from class: l.ba50
            @Override // p149l.d30
            public final void call() {
                OmsBaseRender.m79234m();
            }
        });
        if (oMSDialog.style.showIndicator) {
            VPagerCircleIndicator vPagerCircleIndicator = new VPagerCircleIndicator(this.f54221a);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
            vPagerCircleIndicator.setFillColor(Color.parseColor(oMSDialog.style.indicatorColor));
            vPagerCircleIndicator.setRadius(xdl0.m208407w(oMSDialog.style.indicatorRadius));
            vPagerCircleIndicator.setPageColor(Color.parseColor(oMSDialog.style.indicatorBgColor));
            vPagerCircleIndicator.setOrientation(TEnum.equals(oMSDialog.style.direction, ResourceDirection.f38808v) ? 1 : 0);
            OmsViewPager omsViewPager = this.f54225e;
            vPagerCircleIndicator.m223143c(omsViewPager, omsViewPager.getCurrentItem());
            layoutParams2.gravity = 1;
            m79271t(viewGroup, vPagerCircleIndicator, layoutParams2, new d30() { // from class: l.o950
                @Override // p149l.d30
                public final void call() {
                    OmsBaseRender.m79232k();
                }
            });
        }
        OMSBaseStyle oMSBaseStyle = oMSDialog.style;
        if (oMSBaseStyle.autoSwitch) {
            this.f54227g = C22306c.interval(oMSBaseStyle.autoSwitchTime, TimeUnit.MILLISECONDS).onBackpressureLatest().observeOn(jo0.m142408a()).subscribe(mkd0.m154955G(new e30() { // from class: l.p950
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f147672a.m79248H(c13095d, (Long) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: B */
    public final void m79242B(ViewGroup viewGroup, OMSDialog oMSDialog) {
        f54220o++;
        final OMSDialog oMSDialogM79260T = m79260T(oMSDialog);
        final View viewM79272u = m79272u(oMSDialogM79260T);
        if (NullChecker.m81303a(viewM79272u)) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) m79243C(GroupLayoutType.relative, oMSDialogM79260T, viewGroup);
            layoutParams.setMargins(xdl0.m208407w((int) oMSDialogM79260T.style.marginLeft), xdl0.m208407w((int) oMSDialogM79260T.style.marginTop), xdl0.m208407w((int) oMSDialogM79260T.style.marginRight), xdl0.m208407w((int) oMSDialogM79260T.style.marginBottom));
            viewM79272u.setId(f54220o);
            Iterator<OMSLocationType> it = oMSDialogM79260T.style.location.iterator();
            while (it.hasNext()) {
                layoutParams.addRule(xc50.m208075e(it.next()));
            }
            m79271t(viewGroup, viewM79272u, layoutParams, new d30() { // from class: l.y950
                @Override // p149l.d30
                public final void call() {
                    this.f196935a.m79249I(oMSDialogM79260T, viewM79272u);
                }
            });
        }
        for (final OMSDialog oMSDialog2 : m79259S(oMSDialog)) {
            if (TEnum.equals(oMSDialog2.type, "extra")) {
                this.f54226f = oMSDialog2;
            } else {
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) m79243C(GroupLayoutType.relative, oMSDialog2, viewGroup);
                final View viewM79272u2 = m79272u(oMSDialog2);
                layoutParams2.setMargins(xdl0.m208407w((int) oMSDialog2.style.marginLeft), xdl0.m208407w((int) oMSDialog2.style.marginTop), xdl0.m208407w((int) oMSDialog2.style.marginRight), xdl0.m208407w((int) oMSDialog2.style.marginBottom));
                for (OMSLocationType oMSLocationType : oMSDialog2.style.location) {
                    if (oMSDialog2.needApplyChild) {
                        layoutParams2.addRule(xc50.m208075e(oMSLocationType), f54220o);
                    } else {
                        layoutParams2.addRule(xc50.m208075e(oMSLocationType));
                    }
                }
                m79271t(viewGroup, viewM79272u2, layoutParams2, new d30() { // from class: l.z950
                    @Override // p149l.d30
                    public final void call() {
                        this.f202271a.m79250J(oMSDialog2, viewM79272u2);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: C */
    public final ViewGroup.LayoutParams m79243C(GroupLayoutType groupLayoutType, OMSDialog oMSDialog, ViewGroup viewGroup) {
        int iM79244D;
        int iM79244D2;
        boolean zEquals = TEnum.equals(oMSDialog.style.widthType, OMSSizeType.ratio);
        OMSBaseStyle oMSBaseStyle = oMSDialog.style;
        if (zEquals) {
            OMSSizeType oMSSizeType = oMSBaseStyle.heightType;
            int i = (int) oMSBaseStyle.height;
            float f = oMSBaseStyle.width;
            iM79244D = m79244D(oMSSizeType, i, f > 0.0f ? (int) f : viewGroup.getWidth(), oMSDialog.style.ratio);
            OMSBaseStyle oMSBaseStyle2 = oMSDialog.style;
            OMSSizeType oMSSizeType2 = oMSBaseStyle2.widthType;
            int i2 = (int) oMSBaseStyle2.width;
            float f2 = oMSBaseStyle2.height;
            iM79244D2 = m79244D(oMSSizeType2, i2, f2 > 0.0f ? (int) f2 : viewGroup.getHeight(), oMSDialog.style.ratio);
        } else {
            OMSSizeType oMSSizeType3 = oMSBaseStyle.widthType;
            int i3 = (int) oMSBaseStyle.width;
            float f3 = oMSBaseStyle.height;
            int iM79244D3 = m79244D(oMSSizeType3, i3, f3 > 0.0f ? (int) f3 : viewGroup.getHeight(), oMSDialog.style.ratio);
            OMSBaseStyle oMSBaseStyle3 = oMSDialog.style;
            OMSSizeType oMSSizeType4 = oMSBaseStyle3.heightType;
            int i4 = (int) oMSBaseStyle3.height;
            float f4 = oMSBaseStyle3.width;
            iM79244D = m79244D(oMSSizeType4, i4, f4 > 0.0f ? (int) f4 : viewGroup.getWidth(), oMSDialog.style.ratio);
            iM79244D2 = iM79244D3;
        }
        if (TEnum.equals(oMSDialog.type, OMSTemplateModeType.page)) {
            iM79244D = -2;
        }
        int i5 = C13093b.f54236a[groupLayoutType.ordinal()];
        if (i5 != 1) {
            return i5 != 2 ? new LinearLayout.LayoutParams(iM79244D2, iM79244D) : new RelativeLayout.LayoutParams(iM79244D2, iM79244D);
        }
        return new FrameLayout.LayoutParams(iM79244D2, iM79244D);
    }

    /* JADX INFO: renamed from: D */
    public final int m79244D(OMSSizeType oMSSizeType, int i, int i2, float f) {
        String string = oMSSizeType.toString();
        string.getClass();
        switch (string) {
            case "ratio":
                return (int) (xdl0.m208407w(i2) * f);
            case "wrap_content":
                return -2;
            case "match_parent":
                return -1;
            default:
                return xdl0.m208407w(i);
        }
    }

    /* JADX INFO: renamed from: E */
    public final boolean m79245E(OMSTemplateModeType oMSTemplateModeType) {
        return TEnum.equals(oMSTemplateModeType, OMSTemplateModeType.hstack) || TEnum.equals(oMSTemplateModeType, OMSTemplateModeType.vstack) || TEnum.equals(oMSTemplateModeType, "overlap") || TEnum.equals(oMSTemplateModeType, "button") || TEnum.equals(oMSTemplateModeType, OMSTemplateModeType.page);
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m79246F(OMSDialog oMSDialog, View view) {
        if (m79245E(oMSDialog.type)) {
            m79274w((ViewGroup) view, oMSDialog);
        }
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m79247G(OMSDialog oMSDialog, View view) {
        if (m79245E(oMSDialog.type)) {
            m79274w((ViewGroup) view, oMSDialog);
        }
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m79248H(C13095d c13095d, Long l2) {
        int currentItem = this.f54225e.getCurrentItem();
        int size = c13095d.f54241e.size() - 1;
        OmsViewPager omsViewPager = this.f54225e;
        if (currentItem == size) {
            omsViewPager.m4176T(0, true);
        } else {
            omsViewPager.m4176T(omsViewPager.getCurrentItem() + 1, true);
        }
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m79249I(OMSDialog oMSDialog, View view) {
        if (m79245E(oMSDialog.type)) {
            m79274w((ViewGroup) view, oMSDialog);
        }
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m79250J(OMSDialog oMSDialog, View view) {
        if (m79245E(oMSDialog.type)) {
            m79274w((ViewGroup) view, oMSDialog);
        }
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m79251K(OMSDialog oMSDialog, View view) {
        if (m79245E(oMSDialog.type)) {
            m79274w((ViewGroup) view, oMSDialog);
        }
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m79252L(View view, Bitmap bitmap) {
        if (view == null || bitmap.isRecycled()) {
            return;
        }
        view.setBackground(new BitmapDrawable(this.f54221a.getResources(), bitmap));
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m79253M(final View view, OMSDialog oMSDialog, final Bitmap bitmap) {
        if (NullChecker.m81303a(bitmap)) {
            this.f54221a.runOnUiThread(new Runnable() { // from class: l.s950
                @Override // java.lang.Runnable
                public final void run() {
                    this.f163146a.m79252L(view, bitmap);
                }
            });
            return;
        }
        CrashHelper.m81297d(new RuntimeException("OMSDialogRender identifer:" + this.f54222b.identifier + " bgUrl:" + oMSDialog.bgImage), 100);
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m79254N(OMSDialog oMSDialog, int i, View view) {
        boolean z;
        boolean z2;
        if (vwb.m200296J(nc50.m158912f().m158914b())) {
            return;
        }
        OMSAction oMSAction = oMSDialog.actions.get(i);
        Iterator<zuj0> it = nc50.m158912f().m158914b().iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                z2 = false;
                break;
            } else if (it.next().m220230a(oMSAction, this)) {
                z = true;
                z2 = !vwb.m200296J(oMSAction.preCondition);
                break;
            }
        }
        if (!z) {
            new ry50().m220232e(this).mo99645c(oMSDialog.actions.get(i));
        }
        if (z2 || TextUtils.isEmpty(oMSDialog.mercury.f38800id)) {
            return;
        }
        OmsMerCuryData omsMerCuryData = oMSDialog.mercury;
        xc50.m208077g(omsMerCuryData.f38800id, this.f54222b.mercury.f38800id, omsMerCuryData.server);
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m79255O(DialogInterface dialogInterface) {
        m79266Z();
        i0e.m133797f(this.f54232l);
        DialogInterface.OnShowListener onShowListener = this.f54234n;
        if (onShowListener != null) {
            onShowListener.onShow(dialogInterface);
        }
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m79256P(DialogInterface dialogInterface) {
        mkd0.m154992z(this.f54227g);
        i0e.m133796e(this.f54232l);
        nc50.m158912f().m158920i();
        DialogInterface.OnDismissListener onDismissListener = this.f54233m;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(dialogInterface);
        }
    }

    /* JADX INFO: renamed from: Q */
    public void m79257Q() {
        if (this.f54221a.isFinishing() || this.f54221a.isDestroyed() || this.f54223c.m20529Y() == null || !this.f54223c.m20529Y().isShowing()) {
            return;
        }
        mkd0.m154992z(this.f54227g);
        i0e.m133796e(this.f54232l);
        this.f54223c.m20529Y().dismiss();
    }

    /* JADX INFO: renamed from: R */
    public void m79258R() {
        this.f54223c = this.f54221a.dialog();
        this.f54229i = m79262V(this.f54222b.content.morph);
    }

    /* JADX INFO: renamed from: S */
    public final List<OMSDialog> m79259S(OMSDialog oMSDialog) {
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
            CrashHelper.m81296c(e);
            this.f54228h = true;
            e.toString();
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: T */
    public final OMSDialog m79260T(OMSDialog oMSDialog) {
        OMSDialog oMSDialog2 = oMSDialog.childJson;
        if (oMSDialog2 != null) {
            return oMSDialog2;
        }
        try {
            return OMSDialog.JSON_ADAPTER.parse(oMSDialog.child);
        } catch (IOException e) {
            CrashHelper.m81296c(e);
            this.f54228h = true;
            e.toString();
            return null;
        }
    }

    /* JADX INFO: renamed from: U */
    public void m79261U(String str) {
        OMSDialog value;
        Iterator<Map.Entry<OMSAction, OMSDialog>> it = this.f54231k.entrySet().iterator();
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
        if (!vwb.m200296J(nc50.m158912f().m158914b())) {
            Iterator<zuj0> it2 = nc50.m158912f().m158914b().iterator();
            while (it2.hasNext()) {
                if (it2.next().m220230a(value.actions.get(0), this)) {
                }
            }
            new ry50().m220232e(this).mo99645c(value.actions.get(0));
        }
        value.actions.get(0).preCondition = list;
    }

    /* JADX INFO: renamed from: V */
    public View m79262V(final OMSDialog oMSDialog) {
        ViewGroup frameLayout = new FrameLayout(this.f54221a);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) m79243C(GroupLayoutType.frame, oMSDialog, frameLayout);
        final View viewM79272u = m79272u(oMSDialog);
        layoutParams.setMargins(xdl0.m208407w((int) oMSDialog.style.marginLeft), xdl0.m208407w((int) oMSDialog.style.marginTop), xdl0.m208407w((int) oMSDialog.style.marginRight), xdl0.m208407w((int) oMSDialog.style.marginBottom));
        m79271t(frameLayout, viewM79272u, layoutParams, new d30() { // from class: l.n950
            @Override // p149l.d30
            public final void call() {
                this.f137723a.m79251K(oMSDialog, viewM79272u);
            }
        });
        return frameLayout;
    }

    /* JADX INFO: renamed from: W */
    public final void m79263W(final View view, final OMSDialog oMSDialog) {
        if (!TextUtils.isEmpty(oMSDialog.bgImage)) {
            String strM112044g = dji0.m112044g(oMSDialog.bgImage);
            if (ic50.m135327j().m135334g().m149209a(strM112044g)) {
                view.setBackgroundResource(ic50.m135327j().m135334g().m149210b(strM112044g).intValue());
                return;
            } else {
                qib0.f154691G.m102324I(strM112044g, new e30() { // from class: l.v950
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f180611a.m79253M(view, oMSDialog, (Bitmap) obj);
                    }
                });
                return;
            }
        }
        if (vwb.m200296J(oMSDialog.style.bgColors)) {
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
            gradientDrawable.setStroke(xdl0.m208407w(oMSDialog.style.borderWidth), Color.parseColor(oMSDialog.style.borderColor));
        }
        view.setBackground(gradientDrawable);
    }

    /* JADX INFO: renamed from: X */
    public final void m79264X(View view, final OMSDialog oMSDialog, final int i) {
        if (!NullChecker.m81303a(oMSDialog.actions) || oMSDialog.actions.size() <= 0) {
            return;
        }
        this.f54231k.put(oMSDialog.actions.get(i), oMSDialog);
        view.setOnClickListener(new View.OnClickListener() { // from class: l.aa50
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f68273a.m79254N(oMSDialog, i, view2);
            }
        });
    }

    /* JADX INFO: renamed from: Y */
    public final void m79265Y(VDraweeView vDraweeView, OMSDialog oMSDialog, boolean z) {
        ftd0 ftd0VarM208074d = xc50.m208074d(oMSDialog.style.scaleType);
        djj djjVar = (djj) vDraweeView.getHierarchy();
        if (NullChecker.m81303a(ftd0VarM208074d)) {
            djjVar.m112076w(ftd0VarM208074d);
        }
        float f = oMSDialog.style.cornerRadius;
        if (f > 0.0f) {
            djjVar.m112053H(RoundingParams.m8249c(f));
        }
        String strM112044g = dji0.m112044g(z ? oMSDialog.image : oMSDialog.src);
        if (!TextUtils.isEmpty(oMSDialog.foreImage)) {
            vDraweeView.setForeground(this.f54221a.getDrawable(ic50.m135327j().m135334g().m149210b(dji0.m112044g(oMSDialog.foreImage)).intValue()));
        }
        if (ic50.m135327j().m135334g().m149209a(strM112044g)) {
            vDraweeView.setImageResource(ic50.m135327j().m135334g().m149210b(strM112044g).intValue());
        } else if (!TextUtils.isEmpty(strM112044g)) {
            float f2 = oMSDialog.style.blurRadius;
            if (f2 == 0.0f) {
                qib0.f154691G.m102331L0(vDraweeView, strM112044g);
            } else {
                qib0.f154691G.m102336O(vDraweeView, strM112044g, 4, (int) f2);
            }
        }
        OMSBaseStyle oMSBaseStyle = oMSDialog.style;
        if (oMSBaseStyle.borderWidth <= 0.0f || TextUtils.isEmpty(oMSBaseStyle.borderColor)) {
            return;
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setStroke(xdl0.m208407w(oMSDialog.style.borderWidth), Color.parseColor(oMSDialog.style.borderColor));
        vDraweeView.setBackground(gradientDrawable);
    }

    /* JADX INFO: renamed from: Z */
    public boolean m79266Z() {
        if (!NullChecker.m81303a(this.f54226f)) {
            return false;
        }
        m79267a0(this.f54223c.m20529Y().f15419x, this.f54226f);
        m79264X(this.f54223c.m20529Y().f15419x, this.f54226f, 0);
        return true;
    }

    /* JADX INFO: renamed from: a0 */
    public final void m79267a0(TextView textView, OMSDialog oMSDialog) {
        Act act = this.f54221a;
        OMSDialogInfo oMSDialogInfo = this.f54222b;
        j760<SpannableStringBuilder, Boolean> j760VarM112043f = dji0.m112043f(act, oMSDialogInfo.needLanguage ? dji0.m112041d(oMSDialogInfo, oMSDialog) : oMSDialog.content, 1.0d, null);
        if (!TEnum.equals(oMSDialog.style.alignment, "unknown_")) {
            textView.setGravity(xc50.m208073c(oMSDialog.style.alignment));
        }
        textView.setText(j760VarM112043f.f116564a);
        textView.setLineSpacing(oMSDialog.style.lineSpacing, 1.0f);
        if (j760VarM112043f.f116565b.booleanValue()) {
            textView.setMovementMethod(LinkMovementMethod.getInstance());
        }
        if (IntlCountryCodeController.m28124t()) {
            textView.setMaxLines(8);
        } else {
            textView.setMaxLines(4);
        }
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setHighlightColor(textView.getResources().getColor(v0c0.f179108o));
    }

    /* JADX INFO: renamed from: b0 */
    public void m79268b0(DialogInterface.OnDismissListener onDismissListener) {
        this.f54233m = onDismissListener;
    }

    /* JADX INFO: renamed from: c0 */
    public void m79269c0() {
        this.f54223c = this.f54221a.dialog();
        this.f54232l = i0e.m133794c(this.f54222b.mercury.f38800id, this.f54229i.getClass().getName());
        if (NullChecker.m81303a(this.f54222b.mercury.server) && this.f54222b.mercury.server.size() > 0) {
            j760[] j760VarArr = new j760[this.f54222b.mercury.server.size()];
            int i = 0;
            for (Map.Entry<String, String> entry : this.f54222b.mercury.server.entrySet()) {
                j760VarArr[i] = new j760(entry.getKey(), dji0.m112044g(entry.getValue()));
                i++;
            }
            this.f54232l.m109040p(j760VarArr);
        }
        if (NullChecker.m81303a(this.f54226f)) {
            this.f54223c.m20552r0("temp");
        }
        this.f54223c.m20496B(this.f54222b.cancelAble).m20520P(this.f54229i, false).m20497B0(new DialogInterface.OnShowListener() { // from class: l.t950
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                this.f168992a.m79255O(dialogInterface);
            }
        }).m20526V(new DialogInterface.OnDismissListener() { // from class: l.u950
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f175192a.m79256P(dialogInterface);
            }
        });
        if (TEnum.equals(this.f54222b.content.morph.baseStyle, OMSMorphBaseStyle.bigScreen)) {
            this.f54223c.m20521Q().m20516L(u7c0.f174992j);
        } else {
            boolean zEquals = TEnum.equals(this.f54222b.content.morph.style.uiType, OMSUIType.new_type);
            Dialog.C4309e c4309e = this.f54223c;
            if (zEquals) {
                c4309e.m20516L(u7c0.f174988f);
            } else {
                c4309e.m20557u();
            }
        }
        nc50.m158912f().m158921j(this);
        this.f54223c.m20568z0();
    }

    /* JADX INFO: renamed from: d0 */
    public void m79270d0(String str) {
        OMSDialogInfo oMSDialogInfo = this.f54222b;
        if (oMSDialogInfo.needLanguage) {
            str = dji0.m112042e(oMSDialogInfo, str);
        }
        osi0.m165783g(str);
    }

    /* JADX INFO: renamed from: t */
    public final void m79271t(ViewGroup viewGroup, View view, ViewGroup.LayoutParams layoutParams, d30 d30Var) {
        if (view == null) {
            this.f54228h = true;
        } else {
            viewGroup.addView(view, layoutParams);
            d30Var.call();
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: u */
    public final View m79272u(OMSDialog oMSDialog) {
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
                vFrame = new VFrame(this.f54221a);
                break;
            case 1:
            case 3:
                VLinear vLinear = new VLinear(this.f54221a);
                vLinear.setGravity(xc50.m208073c(oMSDialog.style.alignment));
                vFrame = vLinear;
                break;
            case 2:
                vFrame = (!TextUtils.isEmpty(oMSDialog.child) || oMSDialog.childJson != null) ? new VRelative(this.f54221a) : new VFrame(this.f54221a);
                break;
            case 4:
                VSwitchButton vSwitchButton = new VSwitchButton(this.f54221a);
                vSwitchButton.setChecked(oMSDialog.style.checked);
                vFrame = vSwitchButton;
                break;
            case 5:
                LinearLayout linearLayout = new LinearLayout(this.f54221a);
                linearLayout.setOrientation(1);
                vFrame = linearLayout;
                break;
            case 6:
                TextView vText = new VText(this.f54221a);
                m79267a0(vText, oMSDialog);
                vFrame = vText;
                break;
            case 7:
                vFrame = new View(this.f54221a);
                break;
            case 8:
                VDraweeView vDraweeView = new VDraweeView(this.f54221a);
                m79265Y(vDraweeView, oMSDialog, false);
                vFrame = vDraweeView;
                break;
            case 9:
                vFrame = new Space(this.f54221a);
                break;
            case 10:
                VCheckBox vCheckBox = new VCheckBox(this.f54221a);
                vCheckBox.setButtonDrawable((Drawable) null);
                vCheckBox.setChecked(oMSDialog.style.checked);
                vFrame = vCheckBox;
                break;
        }
        if (NullChecker.m81303a(vFrame)) {
            m79263W(vFrame, oMSDialog);
            m79264X(vFrame, oMSDialog, 0);
            vFrame.setPadding(xdl0.m208407w((int) oMSDialog.style.paddingLeft), xdl0.m208407w((int) oMSDialog.style.paddingTop), xdl0.m208407w((int) oMSDialog.style.paddingRight), xdl0.m208407w((int) oMSDialog.style.paddingBottom));
        }
        return vFrame;
    }

    /* JADX INFO: renamed from: v */
    public void m79273v(OMSAction oMSAction) {
        OMSDialog oMSDialog = this.f54231k.get(oMSAction);
        if (oMSDialog == null) {
            return;
        }
        String string = oMSDialog.type.toString();
        string.getClass();
        if (string.equals(OMSTemplateModeType.switch_btn) || string.equals(OMSTemplateModeType.checkbox)) {
            boolean z = oMSDialog.style.checked;
            OMSDialog oMSDialogMo223809clone = oMSDialog.mo223809clone();
            oMSDialogMo223809clone.style.checked = !z;
            this.f54231k.put(oMSAction, oMSDialogMo223809clone);
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m79274w(ViewGroup viewGroup, OMSDialog oMSDialog) {
        if (!TEnum.equals(oMSDialog.type, "button") && TextUtils.isEmpty(oMSDialog.nodes) && oMSDialog.nodesJson == null) {
            return;
        }
        if (TEnum.equals(oMSDialog.type, OMSTemplateModeType.vstack) || TEnum.equals(oMSDialog.type, OMSTemplateModeType.hstack)) {
            m79277z(viewGroup, oMSDialog);
            return;
        }
        if (TEnum.equals(oMSDialog.type, "overlap")) {
            if (TextUtils.isEmpty(oMSDialog.child) && oMSDialog.childJson == null) {
                m79276y(viewGroup, oMSDialog);
                return;
            } else {
                m79242B(viewGroup, oMSDialog);
                return;
            }
        }
        if (TEnum.equals(oMSDialog.type, "button")) {
            m79275x(viewGroup, oMSDialog);
        } else if (TEnum.equals(oMSDialog.type, OMSTemplateModeType.page)) {
            m79241A(viewGroup, oMSDialog);
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m79275x(ViewGroup viewGroup, OMSDialog oMSDialog) {
        TextView textView;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        List<OMSDialog> listM79259S = m79259S(oMSDialog);
        if (vwb.m200296J(listM79259S) || listM79259S.size() <= 0) {
            return;
        }
        OMSDialog oMSDialog2 = listM79259S.get(0);
        if (TextUtils.isEmpty(oMSDialog2.src) || vwb.m200296J(oMSDialog2.style.imageSize) || oMSDialog2.style.imageSize.size() <= 1) {
            textView = new TextView(this.f54221a);
            m79267a0(textView, listM79259S.get(0));
            m79271t(viewGroup, textView, layoutParams, new d30() { // from class: l.r950
                @Override // p149l.d30
                public final void call() {
                    OmsBaseRender.m79226e();
                }
            });
        } else {
            RelativeLayout relativeLayout = new RelativeLayout(this.f54221a);
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(xdl0.m208407w(oMSDialog2.style.imageSize.get(0).intValue()), xdl0.m208407w(oMSDialog2.style.imageSize.get(1).intValue()));
            VDraweeView vDraweeView = new VDraweeView(this.f54221a);
            m79265Y(vDraweeView, listM79259S.get(1), true);
            layoutParams2.addRule(15);
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
            textView = new TextView(this.f54221a);
            m79267a0(textView, listM79259S.get(0));
            int i = f54220o + 1;
            f54220o = i;
            vDraweeView.setId(i);
            layoutParams3.addRule(15);
            layoutParams3.addRule(1, f54220o);
            layoutParams3.leftMargin = xdl0.m208407w((int) oMSDialog.style.spacing);
            relativeLayout.addView(vDraweeView, layoutParams2);
            relativeLayout.addView(textView, layoutParams3);
            m79271t(viewGroup, relativeLayout, layoutParams, new d30() { // from class: l.q950
                @Override // p149l.d30
                public final void call() {
                    OmsBaseRender.m79223b();
                }
            });
        }
        if (listM79259S.size() > 1) {
            this.f54224d.add(new C13094c(viewGroup, textView, listM79259S, oMSDialog));
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m79276y(ViewGroup viewGroup, OMSDialog oMSDialog) {
        for (final OMSDialog oMSDialog2 : m79259S(oMSDialog)) {
            if (TEnum.equals(oMSDialog2.type, "extra")) {
                this.f54226f = oMSDialog2;
            } else {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) m79243C(GroupLayoutType.frame, oMSDialog2, viewGroup);
                final View viewM79272u = m79272u(oMSDialog2);
                layoutParams.gravity = xc50.m208072b(oMSDialog2.style.location);
                layoutParams.setMargins(xdl0.m208407w((int) oMSDialog2.style.marginLeft), xdl0.m208407w((int) oMSDialog2.style.marginTop), xdl0.m208407w((int) oMSDialog2.style.marginRight), xdl0.m208407w((int) oMSDialog2.style.marginBottom));
                m79271t(viewGroup, viewM79272u, layoutParams, new d30() { // from class: l.x950
                    @Override // p149l.d30
                    public final void call() {
                        this.f191575a.m79246F(oMSDialog2, viewM79272u);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m79277z(ViewGroup viewGroup, OMSDialog oMSDialog) {
        ((LinearLayout) viewGroup).setOrientation(TEnum.equals(oMSDialog.type, OMSTemplateModeType.vstack) ? 1 : 0);
        for (final OMSDialog oMSDialog2 : m79259S(oMSDialog)) {
            if (TEnum.equals(oMSDialog2.type, "extra")) {
                this.f54226f = oMSDialog2;
            } else {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) m79243C(GroupLayoutType.linear, oMSDialog2, viewGroup);
                final View viewM79272u = m79272u(oMSDialog2);
                layoutParams.gravity = xc50.m208072b(oMSDialog2.style.location);
                layoutParams.setMargins(xdl0.m208407w((int) oMSDialog2.style.marginLeft), xdl0.m208407w((int) oMSDialog2.style.marginTop), xdl0.m208407w((int) oMSDialog2.style.marginRight), xdl0.m208407w((int) oMSDialog2.style.marginBottom));
                m79271t(viewGroup, viewM79272u, layoutParams, new d30() { // from class: l.w950
                    @Override // p149l.d30
                    public final void call() {
                        this.f185300a.m79247G(oMSDialog2, viewM79272u);
                    }
                });
            }
        }
    }
}
