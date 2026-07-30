package com.idv.identity.platform;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import androidx.viewpager.widget.ViewPager;
import com.idv.identity.platform.log.RecordLevel;
import com.idv.identity.platform.log.RecordService;
import com.idv.identity.platform.model.NfcConfigRes;
import com.idv.identity.platform.widget.IndicatorView;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import p149l.d720;
import p149l.e16;
import p149l.gbl0;
import p149l.ixq0;
import p149l.kcm;
import p149l.l4c0;
import p149l.mcm;
import p149l.mxb;
import p149l.ncm;
import p149l.pcm;
import p149l.r2c0;
import p149l.rcm;
import p149l.s1c0;
import p149l.w660;
import p149l.w7q0;
import p149l.y5c0;
import p149l.z500;

/* JADX INFO: loaded from: classes7.dex */
public class CardGuideActivity extends IntlFaceBaseActivity {

    /* JADX INFO: renamed from: c */
    ViewPager f12669c;

    /* JADX INFO: renamed from: d */
    IndicatorView f12670d;

    /* JADX INFO: renamed from: e */
    private List<View> f12671e;

    /* JADX INFO: renamed from: f */
    private w660 f12672f;

    /* JADX INFO: renamed from: g */
    private ImageView f12673g;

    /* JADX INFO: renamed from: h */
    private Button f12674h;

    /* JADX INFO: renamed from: i */
    private LinearLayout f12675i;

    /* JADX INFO: renamed from: j */
    private TextView f12676j;

    /* JADX INFO: renamed from: k */
    private CheckBox f12677k;

    /* JADX INFO: renamed from: l */
    public long f12678l;

    /* JADX INFO: renamed from: m */
    kcm f12679m = kcm.m145452H();

    /* JADX INFO: renamed from: n */
    private Handler f12680n = new Handler(new C3686b());

    /* JADX INFO: renamed from: com.idv.identity.platform.CardGuideActivity$a */
    public class C3685a implements IdentityAlertOverlay.InterfaceC3705d {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ InterfaceC3695k f12681a;

        public C3685a(InterfaceC3695k interfaceC3695k) {
            this.f12681a = interfaceC3695k;
        }

        @Override // com.idv.identity.platform.IdentityAlertOverlay.InterfaceC3705d
        /* JADX INFO: renamed from: a */
        public void mo17692a() {
            CardGuideActivity.this.m18081l1(true);
            RecordService recordService = RecordService.getInstance();
            RecordLevel recordLevel = RecordLevel.LOG_INFO;
            recordService.recordEventBehavior(recordLevel, "PAGER_BEHAVIOR", "exitConfirmBtn", "GUIDE");
            RecordService.getInstance().recordEventBehavior(recordLevel, "PAGER_BEHAVIOR", "exitAlertClose", "GUIDE");
            InterfaceC3695k interfaceC3695k = this.f12681a;
            if (interfaceC3695k != null) {
                interfaceC3695k.mo18087a();
            }
        }

        @Override // com.idv.identity.platform.IdentityAlertOverlay.InterfaceC3705d
        public void onCancel() {
            CardGuideActivity.this.m18081l1(true);
            RecordService recordService = RecordService.getInstance();
            RecordLevel recordLevel = RecordLevel.LOG_INFO;
            recordService.recordEventBehavior(recordLevel, "PAGER_BEHAVIOR", "exitCancelBtn", "GUIDE");
            RecordService.getInstance().recordEventBehavior(recordLevel, "PAGER_BEHAVIOR", "exitAlertClose", "GUIDE");
            InterfaceC3695k interfaceC3695k = this.f12681a;
            if (interfaceC3695k != null) {
                interfaceC3695k.onCancel();
            }
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.platform.CardGuideActivity$b */
    public class C3686b implements Handler.Callback {
        public C3686b() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (1001 != message.what) {
                return true;
            }
            CardGuideActivity.this.m18076a1((String) message.obj);
            return true;
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.platform.CardGuideActivity$c */
    public class ViewOnClickListenerC3687c implements View.OnClickListener {
        public ViewOnClickListenerC3687c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CardGuideActivity.this.onBackPressed();
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.platform.CardGuideActivity$d */
    public class C3688d implements CompoundButton.OnCheckedChangeListener {
        public C3688d() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            String strValueOf = String.valueOf(System.currentTimeMillis() / 1000);
            if (z) {
                RecordService.getInstance().recordEvent(RecordLevel.LOG_ERROR, "AGREE_AUTH", "currentTimeMillis", strValueOf);
                kcm.m145452H().m145477H0(String.valueOf(strValueOf));
            }
            CardGuideActivity.this.m18082Q0(z);
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.platform.CardGuideActivity$e */
    public class ViewOnClickListenerC3689e implements View.OnClickListener {
        public ViewOnClickListenerC3689e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CardGuideActivity.this.m18085X0();
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.platform.CardGuideActivity$f */
    public class ViewOnClickListenerC3690f implements View.OnClickListener {
        public ViewOnClickListenerC3690f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.platform.CardGuideActivity$g */
    public class C3691g extends w660 {
        public C3691g() {
        }

        @Override // p149l.w660
        public void destroyItem(@NonNull ViewGroup viewGroup, int i, @NonNull Object obj) {
            viewGroup.removeView((View) CardGuideActivity.this.f12671e.get(i));
        }

        @Override // p149l.w660
        public int getCount() {
            return CardGuideActivity.this.f12671e.size();
        }

        @Override // p149l.w660
        @NonNull
        public Object instantiateItem(@NonNull ViewGroup viewGroup, int i) {
            viewGroup.addView((View) CardGuideActivity.this.f12671e.get(i));
            return CardGuideActivity.this.f12671e.get(i);
        }

        @Override // p149l.w660
        public boolean isViewFromObject(@NonNull View view, @NonNull Object obj) {
            return view == obj;
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.platform.CardGuideActivity$h */
    public class C3692h implements ViewPager.InterfaceC0716j {
        public C3692h() {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageScrollStateChanged(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageScrolled(int i, float f, int i2) {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageSelected(int i) {
            CardGuideActivity.this.f12670d.setCurrentSelectedPosition(i);
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.platform.CardGuideActivity$i */
    public class C3693i extends ClickableSpan {
        public C3693i() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(@NonNull View view) {
            CardGuideActivity.this.m18084W0();
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(@NonNull TextPaint textPaint) {
            super.updateDrawState(textPaint);
            textPaint.setColor(e16.m114375c(CardGuideActivity.this, s1c0.f161880f));
            textPaint.setUnderlineText(false);
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.platform.CardGuideActivity$j */
    public class C3694j implements InterfaceC3695k {
        public C3694j() {
        }

        @Override // com.idv.identity.platform.CardGuideActivity.InterfaceC3695k
        /* JADX INFO: renamed from: a */
        public void mo18087a() {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "userBack", "type", "closeButton");
            CardGuideActivity.this.m18078f1(ncm.f138196f);
        }

        @Override // com.idv.identity.platform.CardGuideActivity.InterfaceC3695k
        public void onCancel() {
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.platform.CardGuideActivity$k */
    public interface InterfaceC3695k {
        /* JADX INFO: renamed from: a */
        void mo18087a();

        void onCancel();
    }

    /* JADX INFO: renamed from: P0 */
    private void m18070P0(String str, LayoutInflater layoutInflater) {
        if (this.f12679m.m145529b0() != null && "scan".equals(str)) {
            this.f12671e.add(m18072S0(layoutInflater));
            return;
        }
        if (this.f12679m.m145529b0() != null && "shoot".equals(str)) {
            this.f12671e.add(m18073T0(layoutInflater));
        } else {
            if (this.f12679m.m145529b0() == null || !"auto".equals(str)) {
                return;
            }
            this.f12671e.add(m18072S0(layoutInflater));
            this.f12671e.add(m18073T0(layoutInflater));
        }
    }

    /* JADX INFO: renamed from: R0 */
    private View m18071R0(LayoutInflater layoutInflater) {
        View viewInflate = layoutInflater.inflate(y5c0.f196413g, (ViewGroup) null);
        TextView textView = (TextView) viewInflate.findViewById(l4c0.f126017z);
        ((ImageView) viewInflate.findViewById(l4c0.f126011t)).setImageDrawable(getResources().getDrawable(r2c0.f157398b));
        textView.setText(com.idv.identity.base.R$string.f11984M);
        TextView textView2 = (TextView) viewInflate.findViewById(l4c0.f126016y);
        textView2.setText(getText(com.idv.identity.base.R$string.f12008d));
        textView.setTextColor(mxb.f136154d.getOcrGuideTitleColor(s1c0.f161885k));
        textView2.setTextColor(mxb.f136154d.getOcrGuideContentColor(s1c0.f161884j));
        return viewInflate;
    }

    /* JADX INFO: renamed from: S0 */
    private View m18072S0(LayoutInflater layoutInflater) {
        View viewInflate = layoutInflater.inflate(y5c0.f196413g, (ViewGroup) null);
        TextView textView = (TextView) viewInflate.findViewById(l4c0.f126017z);
        ((ImageView) viewInflate.findViewById(l4c0.f126011t)).setImageDrawable(getResources().getDrawable(r2c0.f157397a));
        TextView textView2 = (TextView) viewInflate.findViewById(l4c0.f126016y);
        textView2.setText(getText(com.idv.identity.base.R$string.f12014g));
        textView.setText(getText(com.idv.identity.base.R$string.f12016h));
        m18079h1(textView, textView2);
        return viewInflate;
    }

    /* JADX INFO: renamed from: T0 */
    private View m18073T0(LayoutInflater layoutInflater) {
        View viewInflate = layoutInflater.inflate(y5c0.f196413g, (ViewGroup) null);
        TextView textView = (TextView) viewInflate.findViewById(l4c0.f126017z);
        ImageView imageView = (ImageView) viewInflate.findViewById(l4c0.f126011t);
        TextView textView2 = (TextView) viewInflate.findViewById(l4c0.f126016y);
        textView2.setText(getText(com.idv.identity.base.R$string.f12010e));
        imageView.setImageDrawable(getResources().getDrawable(r2c0.f157397a));
        textView.setText(getText(com.idv.identity.base.R$string.f12012f));
        m18079h1(textView, textView2);
        return viewInflate;
    }

    @NonNull
    /* JADX INFO: renamed from: U0 */
    private SpannableString m18074U0(String str, String str2) {
        String str3 = str + str2;
        SpannableString spannableString = new SpannableString(str3);
        C3693i c3693i = new C3693i();
        int iIndexOf = str3.indexOf(str2);
        spannableString.setSpan(c3693i, iIndexOf, str2.length() + iIndexOf, 33);
        return spannableString;
    }

    /* JADX INFO: renamed from: Y0 */
    private void m18075Y0(boolean z, String str, String str2) {
        if (z) {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "GUIDE_START_INIT", "action", "initSDK", NotificationCompat.CATEGORY_STATUS, "success", "productCode", str);
            m18076a1("success");
        } else {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_ERROR, "GUIDE_START_INIT", "action", "initSDK", NotificationCompat.CATEGORY_STATUS, "error", "productCode", str, "errMsg", ncm.f138211u);
            m18077d1(str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a1 */
    public void m18076a1(String str) {
        RecordService.getInstance().recordEventPage(RecordLevel.LOG_INFO, "GUIDE_PAGE_LEAVE", "GUIDE", (System.currentTimeMillis() - this.f12678l) + "ms", str);
        if ("success" != str) {
            kcm.m145452H().m145537e(str);
        }
        finish();
    }

    /* JADX INFO: renamed from: d1 */
    private void m18077d1(String str) {
        Message messageObtain = Message.obtain();
        messageObtain.what = 1001;
        messageObtain.obj = str;
        this.f12680n.sendMessage(messageObtain);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f1 */
    public void m18078f1(String str) {
        kcm.m145452H().m145537e(str);
        RecordService.getInstance().recordEventPage(RecordLevel.LOG_INFO, "GUIDE_PAGE_LEAVE", "GUIDE", (System.currentTimeMillis() - this.f12678l) + "ms", str);
        finish();
    }

    /* JADX INFO: renamed from: h1 */
    private void m18079h1(TextView textView, TextView textView2) {
        textView.setTextColor(mxb.f136154d.getOcrGuideTitleColor(s1c0.f161885k));
        textView2.setTextColor(mxb.f136154d.getOcrGuideContentColor(s1c0.f161884j));
    }

    /* JADX INFO: renamed from: k1 */
    private boolean m18080k1(NfcConfigRes nfcConfigRes) {
        if (nfcConfigRes != null && nfcConfigRes.getNfcMode() != null) {
            if ("0".equals(nfcConfigRes.getNfcMode())) {
                return d720.m110213c(this);
            }
            if ("1".equals(nfcConfigRes.getNfcMode())) {
                return d720.m110215e(false, this);
            }
            if ("2".equals(nfcConfigRes.getNfcMode())) {
                return d720.m110214d(this, nfcConfigRes.getDocumentNumber(), nfcConfigRes.getDateOfBirth(), nfcConfigRes.getDateOfExpiry());
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l1 */
    public void m18081l1(boolean z) {
        this.f12674h.setEnabled(z);
        this.f12673g.setEnabled(z);
    }

    /* JADX INFO: renamed from: Q0 */
    public void m18082Q0(boolean z) {
        Button button = this.f12674h;
        if (button != null) {
            button.setEnabled(z);
            Button button2 = this.f12674h;
            if (z) {
                button2.setBackgroundColor(mxb.f136154d.getOcrGuideStartBtnBGColor(s1c0.f161880f));
                this.f12674h.setTextColor(mxb.f136154d.getOcrGuideStartBtnTextColor(s1c0.f161886l));
            } else {
                button2.setBackgroundColor(mxb.f136154d.getOcrGuideStartBtnDisableBGColor(s1c0.f161883i));
                this.f12674h.setTextColor(mxb.f136154d.getOcrGuideStartBtnDisableTextColor(s1c0.f161886l));
            }
        }
    }

    /* JADX INFO: renamed from: V0 */
    public boolean m18083V0() {
        String language = Locale.getDefault().getLanguage();
        return "in".equals(language) || "id".equals(language);
    }

    /* JADX INFO: renamed from: W0 */
    public void m18084W0() {
        d720.m110211a(this, m18083V0() ? kcm.m145452H().m145549i() : kcm.m145452H().m145546h());
    }

    /* JADX INFO: renamed from: X0 */
    public void m18085X0() {
        boolean zM110215e;
        String str;
        String strM145550i0 = kcm.m145452H().m145550i0();
        boolean zM110215e2 = false;
        String str2 = "";
        if (pcm.f148194g.equals(strM145550i0)) {
            NfcConfigRes nfcConfigResM145488L = kcm.m145452H().m145488L();
            if (nfcConfigResM145488L != null) {
                String nfcMode = nfcConfigResM145488L.getNfcMode();
                String str3 = ncm.f138212v;
                if ("0".equals(nfcMode)) {
                    zM110215e2 = d720.m110213c(this);
                } else if ("1".equals(nfcMode)) {
                    zM110215e2 = d720.m110215e(false, this);
                } else if ("2".equals(nfcMode)) {
                    zM110215e2 = d720.m110214d(this, nfcConfigResM145488L.getDocumentNumber(), nfcConfigResM145488L.getDateOfBirth(), nfcConfigResM145488L.getDateOfExpiry());
                } else {
                    RecordService.getInstance().recordEvent(RecordLevel.LOG_ERROR, "navigatePage", "nfcMode", nfcMode);
                }
                str2 = str3;
            } else {
                RecordService.getInstance().recordEvent(RecordLevel.LOG_ERROR, "navigatePage", "nfcConfigRes", "is null");
            }
        } else if (pcm.f148191d.equals(strM145550i0)) {
            zM110215e2 = d720.m110215e(false, this);
            str2 = ncm.f138213w;
        } else if (pcm.f148192e.equals(strM145550i0)) {
            String strM145587v = kcm.m145452H().m145587v();
            NfcConfigRes nfcConfigResM145488L2 = kcm.m145452H().m145488L();
            if (!mcm.f133148a.equals(strM145587v) || nfcConfigResM145488L2 == null) {
                zM110215e = d720.m110215e(false, this);
                str = ncm.f138213w;
            } else if (getPackageManager().hasSystemFeature("android.hardware.nfc")) {
                zM110215e = m18080k1(nfcConfigResM145488L2);
                str = ncm.f138212v;
            } else {
                RecordService.getInstance().recordEvent(RecordLevel.LOG_ERROR, "START_CKYC", "docType", mcm.f133148a, "warning", ncm.f138215y);
                zM110215e = d720.m110215e(false, this);
                str = ncm.f138213w;
            }
            str2 = str;
            zM110215e2 = zM110215e;
        } else if (pcm.f148193f.equals(strM145550i0)) {
            zM110215e2 = d720.m110215e(false, this);
            str2 = ncm.f138213w;
        }
        m18075Y0(zM110215e2, strM145550i0, str2);
    }

    /* JADX INFO: renamed from: j1 */
    public void m18086j1(String str, String str2, String str3, String str4, String str5, InterfaceC3695k interfaceC3695k) {
        RecordService.getInstance().recordEventBehavior(RecordLevel.LOG_INFO, "PAGER_BEHAVIOR", "exitAlertAppear", "GUIDE");
        IdentityAlertOverlay identityAlertOverlay = new IdentityAlertOverlay(this);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        identityAlertOverlay.setLayoutParams(layoutParams);
        addContentView(identityAlertOverlay, layoutParams);
        m18081l1(false);
        mxb.m156848a(identityAlertOverlay, mxb.m156866s(str5));
        identityAlertOverlay.setTitleText(str);
        identityAlertOverlay.setMessageText(str2);
        if (str4 != null) {
            identityAlertOverlay.setCancelText(str4);
            identityAlertOverlay.setButtonType(true);
        } else {
            identityAlertOverlay.setButtonType(false);
        }
        identityAlertOverlay.setConfirmText(str3);
        identityAlertOverlay.setVisibility(0);
        mxb.m156848a(identityAlertOverlay, mxb.m156867t(str5));
        identityAlertOverlay.setCommAlertOverlayListener(new C3685a(interfaceC3695k));
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        m18086j1(getResources().getString(com.idv.identity.base.R$string.f11995T), "", getResources().getString(com.idv.identity.base.R$string.f11992Q), getResources().getString(com.idv.identity.base.R$string.f11986N), "ocr_exit_code", new C3694j());
    }

    @Override // com.idv.identity.platform.IntlFaceBaseActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        this.f12678l = System.currentTimeMillis();
        setContentView(y5c0.f196407a);
        String strM145546h = kcm.m145452H().m145546h();
        String strM145549i = kcm.m145452H().m145549i();
        m18104J0(false, true, s1c0.f161878d);
        w7q0 w7q0VarM125161H = gbl0.m125161H(getWindow().getDecorView());
        if (w7q0VarM125161H != null) {
            w7q0VarM125161H.m202061b(true);
        }
        RecordService.getInstance().recordEventPage(RecordLevel.LOG_INFO, "GUIDE_PAGE_SHOW", "GUIDE");
        this.f12669c = (ViewPager) findViewById(l4c0.f126005n);
        IndicatorView indicatorView = (IndicatorView) findViewById(l4c0.f126009r);
        this.f12670d = indicatorView;
        indicatorView.setColorSelector(mxb.f136154d.getOcrGuideIndicatorSelectedColor(s1c0.f161881g));
        this.f12670d.setColorUnSelector(mxb.f136154d.getOcrGuideIndicatorUnSelectedColor(s1c0.f161882h));
        this.f12673g = (ImageView) findViewById(l4c0.f126010s);
        Bitmap bitmapM156859l = mxb.m156859l();
        if (bitmapM156859l != null) {
            this.f12673g.setImageBitmap(bitmapM156859l);
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(z500.m217269a(getApplicationContext(), 60.0f), z500.m217269a(getApplicationContext(), 60.0f));
        String str = rcm.f158794i;
        if (str == null || str.isEmpty() || !rcm.f158794i.equalsIgnoreCase("Left")) {
            String str2 = rcm.f158794i;
            if (str2 != null && !str2.isEmpty() && rcm.f158794i.equalsIgnoreCase("Right")) {
                layoutParams.addRule(21);
            }
        } else {
            layoutParams.addRule(20);
        }
        this.f12673g.setLayoutParams(layoutParams);
        this.f12673g.setOnClickListener(new ViewOnClickListenerC3687c());
        this.f12674h = (Button) findViewById(l4c0.f125992a);
        this.f12675i = (LinearLayout) findViewById(l4c0.f126013v);
        this.f12677k = (CheckBox) findViewById(l4c0.f125994c);
        this.f12676j = (TextView) findViewById(l4c0.f126015x);
        this.f12676j.setText(m18074U0(getString(R$string.f12715a), getString(R$string.f12716b)));
        this.f12676j.setMovementMethod(LinkMovementMethod.getInstance());
        this.f12677k.setOnCheckedChangeListener(new C3688d());
        this.f12674h.setOnClickListener(new ViewOnClickListenerC3689e());
        this.f12676j.setOnClickListener(new ViewOnClickListenerC3690f());
        if (strM145546h == null || strM145549i == null || TextUtils.isEmpty(strM145546h) || TextUtils.isEmpty(strM145549i)) {
            m18082Q0(true);
            this.f12675i.setVisibility(8);
        } else {
            m18082Q0(false);
            this.f12675i.setVisibility(0);
        }
        LayoutInflater layoutInflater = getLayoutInflater();
        this.f12671e = new ArrayList();
        String strM145529b0 = kcm.m145452H().m145529b0();
        kcm.m145452H().m145550i0();
        ixq0.m138885b("CardGuideActivity", "getOcrModels:" + this.f12679m.m145529b0());
        String strM145550i0 = kcm.m145452H().m145550i0();
        NfcConfigRes nfcConfigResM145488L = kcm.m145452H().m145488L();
        if (pcm.f148194g.equals(strM145550i0)) {
            this.f12671e.add(m18071R0(layoutInflater));
            if (nfcConfigResM145488L != null && nfcConfigResM145488L.getNfcMode() != null && "1".equals(nfcConfigResM145488L.getNfcMode())) {
                m18070P0(strM145529b0, layoutInflater);
            }
        } else {
            m18070P0(strM145529b0, layoutInflater);
            kcm kcmVar = this.f12679m;
            if (kcmVar != null && kcmVar.m145581t() != null && (this.f12679m.m145534d("OCR_ID_FACE_3D") || this.f12679m.m145534d("OCR_ID_BACK_3D"))) {
                View viewInflate = layoutInflater.inflate(y5c0.f196413g, (ViewGroup) null);
                TextView textView = (TextView) viewInflate.findViewById(l4c0.f126017z);
                TextView textView2 = (TextView) viewInflate.findViewById(l4c0.f126016y);
                ((ImageView) viewInflate.findViewById(l4c0.f126011t)).setImageDrawable(getResources().getDrawable(r2c0.f157399c));
                textView.setText(getResources().getString(com.idv.identity.base.R$string.f12006c));
                textView2.setText(getResources().getString(com.idv.identity.base.R$string.f12006c));
                m18079h1(textView, textView2);
                this.f12671e.add(viewInflate);
            }
        }
        kcm kcmVar2 = this.f12679m;
        if (kcmVar2 != null && kcmVar2.m145581t() != null && (this.f12679m.m145534d("OCR_ID_FACE_3D") || this.f12679m.m145534d("OCR_ID_BACK_3D"))) {
            View viewInflate2 = layoutInflater.inflate(y5c0.f196413g, (ViewGroup) null);
            TextView textView3 = (TextView) viewInflate2.findViewById(l4c0.f126017z);
            TextView textView4 = (TextView) viewInflate2.findViewById(l4c0.f126016y);
            ((ImageView) viewInflate2.findViewById(l4c0.f126011t)).setImageDrawable(getResources().getDrawable(r2c0.f157399c));
            textView3.setText(getResources().getString(com.idv.identity.base.R$string.f12006c));
            textView4.setText(getResources().getString(com.idv.identity.base.R$string.f12004b));
            m18079h1(textView3, textView4);
            this.f12671e.add(viewInflate2);
        }
        this.f12671e.size();
        C3691g c3691g = new C3691g();
        this.f12672f = c3691g;
        this.f12669c.setAdapter(c3691g);
        this.f12670d.setIndicatorItemCount(this.f12672f.getCount());
        this.f12669c.m4185d(new C3692h());
    }

    @Override // com.idv.identity.platform.IntlFaceBaseActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        String.valueOf((System.currentTimeMillis() - this.f12678l) / 1000.0d);
    }
}
