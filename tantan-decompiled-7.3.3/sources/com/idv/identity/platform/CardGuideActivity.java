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
import p153l.afm;
import p153l.azb;
import p153l.bhq0;
import p153l.cf60;
import p153l.cfm;
import p153l.dfm;
import p153l.eec0;
import p153l.ffm;
import p153l.hfm;
import p153l.j26;
import p153l.je00;
import p153l.kkl0;
import p153l.lf20;
import p153l.o6r0;
import p153l.scc0;
import p153l.y8c0;
import p153l.zac0;

/* JADX INFO: loaded from: classes7.dex */
public class CardGuideActivity extends IntlFaceBaseActivity {

    /* JADX INFO: renamed from: c */
    ViewPager f13410c;

    /* JADX INFO: renamed from: d */
    IndicatorView f13411d;

    /* JADX INFO: renamed from: e */
    private List<View> f13412e;

    /* JADX INFO: renamed from: f */
    private cf60 f13413f;

    /* JADX INFO: renamed from: g */
    private ImageView f13414g;

    /* JADX INFO: renamed from: h */
    private Button f13415h;

    /* JADX INFO: renamed from: i */
    private LinearLayout f13416i;

    /* JADX INFO: renamed from: j */
    private TextView f13417j;

    /* JADX INFO: renamed from: k */
    private CheckBox f13418k;

    /* JADX INFO: renamed from: l */
    public long f13419l;

    /* JADX INFO: renamed from: m */
    afm f13420m = afm.m97360H();

    /* JADX INFO: renamed from: n */
    private Handler f13421n = new Handler(new C3845b());

    /* JADX INFO: renamed from: com.idv.identity.platform.CardGuideActivity$a */
    public class C3844a implements IdentityAlertOverlay.InterfaceC3864d {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ InterfaceC3854k f13422a;

        public C3844a(InterfaceC3854k interfaceC3854k) {
            this.f13422a = interfaceC3854k;
        }

        @Override // com.idv.identity.platform.IdentityAlertOverlay.InterfaceC3864d
        /* JADX INFO: renamed from: a */
        public void mo18769a() {
            CardGuideActivity.this.m19158m1(true);
            RecordService recordService = RecordService.getInstance();
            RecordLevel recordLevel = RecordLevel.LOG_INFO;
            recordService.recordEventBehavior(recordLevel, "PAGER_BEHAVIOR", "exitConfirmBtn", "GUIDE");
            RecordService.getInstance().recordEventBehavior(recordLevel, "PAGER_BEHAVIOR", "exitAlertClose", "GUIDE");
            InterfaceC3854k interfaceC3854k = this.f13422a;
            if (interfaceC3854k != null) {
                interfaceC3854k.mo19164a();
            }
        }

        @Override // com.idv.identity.platform.IdentityAlertOverlay.InterfaceC3864d
        public void onCancel() {
            CardGuideActivity.this.m19158m1(true);
            RecordService recordService = RecordService.getInstance();
            RecordLevel recordLevel = RecordLevel.LOG_INFO;
            recordService.recordEventBehavior(recordLevel, "PAGER_BEHAVIOR", "exitCancelBtn", "GUIDE");
            RecordService.getInstance().recordEventBehavior(recordLevel, "PAGER_BEHAVIOR", "exitAlertClose", "GUIDE");
            InterfaceC3854k interfaceC3854k = this.f13422a;
            if (interfaceC3854k != null) {
                interfaceC3854k.onCancel();
            }
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.platform.CardGuideActivity$b */
    public class C3845b implements Handler.Callback {
        public C3845b() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (1001 != message.what) {
                return true;
            }
            CardGuideActivity.this.m19153d1((String) message.obj);
            return true;
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.platform.CardGuideActivity$c */
    public class ViewOnClickListenerC3846c implements View.OnClickListener {
        public ViewOnClickListenerC3846c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CardGuideActivity.this.onBackPressed();
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.platform.CardGuideActivity$d */
    public class C3847d implements CompoundButton.OnCheckedChangeListener {
        public C3847d() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            String strValueOf = String.valueOf(System.currentTimeMillis() / 1000);
            if (z) {
                RecordService.getInstance().recordEvent(RecordLevel.LOG_ERROR, "AGREE_AUTH", "currentTimeMillis", strValueOf);
                afm.m97360H().m97385H0(String.valueOf(strValueOf));
            }
            CardGuideActivity.this.m19159R0(z);
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.platform.CardGuideActivity$e */
    public class ViewOnClickListenerC3848e implements View.OnClickListener {
        public ViewOnClickListenerC3848e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CardGuideActivity.this.m19162Y0();
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.platform.CardGuideActivity$f */
    public class ViewOnClickListenerC3849f implements View.OnClickListener {
        public ViewOnClickListenerC3849f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.platform.CardGuideActivity$g */
    public class C3850g extends cf60 {
        public C3850g() {
        }

        @Override // p153l.cf60
        public void destroyItem(@NonNull ViewGroup viewGroup, int i, @NonNull Object obj) {
            viewGroup.removeView((View) CardGuideActivity.this.f13412e.get(i));
        }

        @Override // p153l.cf60
        public int getCount() {
            return CardGuideActivity.this.f13412e.size();
        }

        @Override // p153l.cf60
        @NonNull
        public Object instantiateItem(@NonNull ViewGroup viewGroup, int i) {
            viewGroup.addView((View) CardGuideActivity.this.f13412e.get(i));
            return CardGuideActivity.this.f13412e.get(i);
        }

        @Override // p153l.cf60
        public boolean isViewFromObject(@NonNull View view, @NonNull Object obj) {
            return view == obj;
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.platform.CardGuideActivity$h */
    public class C3851h implements ViewPager.InterfaceC0718j {
        public C3851h() {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageScrollStateChanged(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageScrolled(int i, float f, int i2) {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageSelected(int i) {
            CardGuideActivity.this.f13411d.setCurrentSelectedPosition(i);
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.platform.CardGuideActivity$i */
    public class C3852i extends ClickableSpan {
        public C3852i() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(@NonNull View view) {
            CardGuideActivity.this.m19161X0();
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(@NonNull TextPaint textPaint) {
            super.updateDrawState(textPaint);
            textPaint.setColor(j26.m143190c(CardGuideActivity.this, y8c0.f197991f));
            textPaint.setUnderlineText(false);
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.platform.CardGuideActivity$j */
    public class C3853j implements InterfaceC3854k {
        public C3853j() {
        }

        @Override // com.idv.identity.platform.CardGuideActivity.InterfaceC3854k
        /* JADX INFO: renamed from: a */
        public void mo19164a() {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "userBack", "type", "closeButton");
            CardGuideActivity.this.m19155h1(dfm.f88185f);
        }

        @Override // com.idv.identity.platform.CardGuideActivity.InterfaceC3854k
        public void onCancel() {
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.platform.CardGuideActivity$k */
    public interface InterfaceC3854k {
        /* JADX INFO: renamed from: a */
        void mo19164a();

        void onCancel();
    }

    /* JADX INFO: renamed from: Q0 */
    private void m19147Q0(String str, LayoutInflater layoutInflater) {
        if (this.f13420m.m97437b0() != null && "scan".equals(str)) {
            this.f13412e.add(m19149T0(layoutInflater));
            return;
        }
        if (this.f13420m.m97437b0() != null && "shoot".equals(str)) {
            this.f13412e.add(m19150U0(layoutInflater));
        } else {
            if (this.f13420m.m97437b0() == null || !"auto".equals(str)) {
                return;
            }
            this.f13412e.add(m19149T0(layoutInflater));
            this.f13412e.add(m19150U0(layoutInflater));
        }
    }

    /* JADX INFO: renamed from: S0 */
    private View m19148S0(LayoutInflater layoutInflater) {
        View viewInflate = layoutInflater.inflate(eec0.f93638g, (ViewGroup) null);
        TextView textView = (TextView) viewInflate.findViewById(scc0.f167237z);
        ((ImageView) viewInflate.findViewById(scc0.f167231t)).setImageDrawable(getResources().getDrawable(zac0.f203548b));
        textView.setText(com.idv.identity.base.R$string.f12725M);
        TextView textView2 = (TextView) viewInflate.findViewById(scc0.f167236y);
        textView2.setText(getText(com.idv.identity.base.R$string.f12749d));
        textView.setTextColor(azb.f74128d.getOcrGuideTitleColor(y8c0.f197996k));
        textView2.setTextColor(azb.f74128d.getOcrGuideContentColor(y8c0.f197995j));
        return viewInflate;
    }

    /* JADX INFO: renamed from: T0 */
    private View m19149T0(LayoutInflater layoutInflater) {
        View viewInflate = layoutInflater.inflate(eec0.f93638g, (ViewGroup) null);
        TextView textView = (TextView) viewInflate.findViewById(scc0.f167237z);
        ((ImageView) viewInflate.findViewById(scc0.f167231t)).setImageDrawable(getResources().getDrawable(zac0.f203547a));
        TextView textView2 = (TextView) viewInflate.findViewById(scc0.f167236y);
        textView2.setText(getText(com.idv.identity.base.R$string.f12755g));
        textView.setText(getText(com.idv.identity.base.R$string.f12757h));
        m19156j1(textView, textView2);
        return viewInflate;
    }

    /* JADX INFO: renamed from: U0 */
    private View m19150U0(LayoutInflater layoutInflater) {
        View viewInflate = layoutInflater.inflate(eec0.f93638g, (ViewGroup) null);
        TextView textView = (TextView) viewInflate.findViewById(scc0.f167237z);
        ImageView imageView = (ImageView) viewInflate.findViewById(scc0.f167231t);
        TextView textView2 = (TextView) viewInflate.findViewById(scc0.f167236y);
        textView2.setText(getText(com.idv.identity.base.R$string.f12751e));
        imageView.setImageDrawable(getResources().getDrawable(zac0.f203547a));
        textView.setText(getText(com.idv.identity.base.R$string.f12753f));
        m19156j1(textView, textView2);
        return viewInflate;
    }

    @NonNull
    /* JADX INFO: renamed from: V0 */
    private SpannableString m19151V0(String str, String str2) {
        String str3 = str + str2;
        SpannableString spannableString = new SpannableString(str3);
        C3852i c3852i = new C3852i();
        int iIndexOf = str3.indexOf(str2);
        spannableString.setSpan(c3852i, iIndexOf, str2.length() + iIndexOf, 33);
        return spannableString;
    }

    /* JADX INFO: renamed from: a1 */
    private void m19152a1(boolean z, String str, String str2) {
        if (z) {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "GUIDE_START_INIT", "action", "initSDK", NotificationCompat.CATEGORY_STATUS, "success", "productCode", str);
            m19153d1("success");
        } else {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_ERROR, "GUIDE_START_INIT", "action", "initSDK", NotificationCompat.CATEGORY_STATUS, "error", "productCode", str, "errMsg", dfm.f88200u);
            m19154f1(str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d1 */
    public void m19153d1(String str) {
        RecordService.getInstance().recordEventPage(RecordLevel.LOG_INFO, "GUIDE_PAGE_LEAVE", "GUIDE", (System.currentTimeMillis() - this.f13419l) + "ms", str);
        if ("success" != str) {
            afm.m97360H().m97445e(str);
        }
        finish();
    }

    /* JADX INFO: renamed from: f1 */
    private void m19154f1(String str) {
        Message messageObtain = Message.obtain();
        messageObtain.what = 1001;
        messageObtain.obj = str;
        this.f13421n.sendMessage(messageObtain);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h1 */
    public void m19155h1(String str) {
        afm.m97360H().m97445e(str);
        RecordService.getInstance().recordEventPage(RecordLevel.LOG_INFO, "GUIDE_PAGE_LEAVE", "GUIDE", (System.currentTimeMillis() - this.f13419l) + "ms", str);
        finish();
    }

    /* JADX INFO: renamed from: j1 */
    private void m19156j1(TextView textView, TextView textView2) {
        textView.setTextColor(azb.f74128d.getOcrGuideTitleColor(y8c0.f197996k));
        textView2.setTextColor(azb.f74128d.getOcrGuideContentColor(y8c0.f197995j));
    }

    /* JADX INFO: renamed from: l1 */
    private boolean m19157l1(NfcConfigRes nfcConfigRes) {
        if (nfcConfigRes != null && nfcConfigRes.getNfcMode() != null) {
            if ("0".equals(nfcConfigRes.getNfcMode())) {
                return lf20.m153965c(this);
            }
            if ("1".equals(nfcConfigRes.getNfcMode())) {
                return lf20.m153967e(false, this);
            }
            if ("2".equals(nfcConfigRes.getNfcMode())) {
                return lf20.m153966d(this, nfcConfigRes.getDocumentNumber(), nfcConfigRes.getDateOfBirth(), nfcConfigRes.getDateOfExpiry());
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m1 */
    public void m19158m1(boolean z) {
        this.f13415h.setEnabled(z);
        this.f13414g.setEnabled(z);
    }

    /* JADX INFO: renamed from: R0 */
    public void m19159R0(boolean z) {
        Button button = this.f13415h;
        if (button != null) {
            button.setEnabled(z);
            Button button2 = this.f13415h;
            if (z) {
                button2.setBackgroundColor(azb.f74128d.getOcrGuideStartBtnBGColor(y8c0.f197991f));
                this.f13415h.setTextColor(azb.f74128d.getOcrGuideStartBtnTextColor(y8c0.f197997l));
            } else {
                button2.setBackgroundColor(azb.f74128d.getOcrGuideStartBtnDisableBGColor(y8c0.f197994i));
                this.f13415h.setTextColor(azb.f74128d.getOcrGuideStartBtnDisableTextColor(y8c0.f197997l));
            }
        }
    }

    /* JADX INFO: renamed from: W0 */
    public boolean m19160W0() {
        String language = Locale.getDefault().getLanguage();
        return "in".equals(language) || "id".equals(language);
    }

    /* JADX INFO: renamed from: X0 */
    public void m19161X0() {
        lf20.m153963a(this, m19160W0() ? afm.m97360H().m97457i() : afm.m97360H().m97454h());
    }

    /* JADX INFO: renamed from: Y0 */
    public void m19162Y0() {
        boolean zM153967e;
        String str;
        String strM97458i0 = afm.m97360H().m97458i0();
        boolean zM153967e2 = false;
        String str2 = "";
        if (ffm.f98804g.equals(strM97458i0)) {
            NfcConfigRes nfcConfigResM97396L = afm.m97360H().m97396L();
            if (nfcConfigResM97396L != null) {
                String nfcMode = nfcConfigResM97396L.getNfcMode();
                String str3 = dfm.f88201v;
                if ("0".equals(nfcMode)) {
                    zM153967e2 = lf20.m153965c(this);
                } else if ("1".equals(nfcMode)) {
                    zM153967e2 = lf20.m153967e(false, this);
                } else if ("2".equals(nfcMode)) {
                    zM153967e2 = lf20.m153966d(this, nfcConfigResM97396L.getDocumentNumber(), nfcConfigResM97396L.getDateOfBirth(), nfcConfigResM97396L.getDateOfExpiry());
                } else {
                    RecordService.getInstance().recordEvent(RecordLevel.LOG_ERROR, "navigatePage", "nfcMode", nfcMode);
                }
                str2 = str3;
            } else {
                RecordService.getInstance().recordEvent(RecordLevel.LOG_ERROR, "navigatePage", "nfcConfigRes", "is null");
            }
        } else if (ffm.f98801d.equals(strM97458i0)) {
            zM153967e2 = lf20.m153967e(false, this);
            str2 = dfm.f88202w;
        } else if (ffm.f98802e.equals(strM97458i0)) {
            String strM97495v = afm.m97360H().m97495v();
            NfcConfigRes nfcConfigResM97396L2 = afm.m97360H().m97396L();
            if (!cfm.f81515a.equals(strM97495v) || nfcConfigResM97396L2 == null) {
                zM153967e = lf20.m153967e(false, this);
                str = dfm.f88202w;
            } else if (getPackageManager().hasSystemFeature("android.hardware.nfc")) {
                zM153967e = m19157l1(nfcConfigResM97396L2);
                str = dfm.f88201v;
            } else {
                RecordService.getInstance().recordEvent(RecordLevel.LOG_ERROR, "START_CKYC", "docType", cfm.f81515a, "warning", dfm.f88204y);
                zM153967e = lf20.m153967e(false, this);
                str = dfm.f88202w;
            }
            str2 = str;
            zM153967e2 = zM153967e;
        } else if (ffm.f98803f.equals(strM97458i0)) {
            zM153967e2 = lf20.m153967e(false, this);
            str2 = dfm.f88202w;
        }
        m19152a1(zM153967e2, strM97458i0, str2);
    }

    /* JADX INFO: renamed from: k1 */
    public void m19163k1(String str, String str2, String str3, String str4, String str5, InterfaceC3854k interfaceC3854k) {
        RecordService.getInstance().recordEventBehavior(RecordLevel.LOG_INFO, "PAGER_BEHAVIOR", "exitAlertAppear", "GUIDE");
        IdentityAlertOverlay identityAlertOverlay = new IdentityAlertOverlay(this);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        identityAlertOverlay.setLayoutParams(layoutParams);
        addContentView(identityAlertOverlay, layoutParams);
        m19158m1(false);
        azb.m101041a(identityAlertOverlay, azb.m101059s(str5));
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
        azb.m101041a(identityAlertOverlay, azb.m101060t(str5));
        identityAlertOverlay.setCommAlertOverlayListener(new C3844a(interfaceC3854k));
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        m19163k1(getResources().getString(com.idv.identity.base.R$string.f12736T), "", getResources().getString(com.idv.identity.base.R$string.f12733Q), getResources().getString(com.idv.identity.base.R$string.f12727N), "ocr_exit_code", new C3853j());
    }

    @Override // com.idv.identity.platform.IntlFaceBaseActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        this.f13419l = System.currentTimeMillis();
        setContentView(eec0.f93632a);
        String strM97454h = afm.m97360H().m97454h();
        String strM97457i = afm.m97360H().m97457i();
        m19181K0(false, true, y8c0.f197989d);
        bhq0 bhq0VarM150124H = kkl0.m150124H(getWindow().getDecorView());
        if (bhq0VarM150124H != null) {
            bhq0VarM150124H.m104356b(true);
        }
        RecordService.getInstance().recordEventPage(RecordLevel.LOG_INFO, "GUIDE_PAGE_SHOW", "GUIDE");
        this.f13410c = (ViewPager) findViewById(scc0.f167225n);
        IndicatorView indicatorView = (IndicatorView) findViewById(scc0.f167229r);
        this.f13411d = indicatorView;
        indicatorView.setColorSelector(azb.f74128d.getOcrGuideIndicatorSelectedColor(y8c0.f197992g));
        this.f13411d.setColorUnSelector(azb.f74128d.getOcrGuideIndicatorUnSelectedColor(y8c0.f197993h));
        this.f13414g = (ImageView) findViewById(scc0.f167230s);
        Bitmap bitmapM101052l = azb.m101052l();
        if (bitmapM101052l != null) {
            this.f13414g.setImageBitmap(bitmapM101052l);
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(je00.m144505a(getApplicationContext(), 60.0f), je00.m144505a(getApplicationContext(), 60.0f));
        String str = hfm.f109324i;
        if (str == null || str.isEmpty() || !hfm.f109324i.equalsIgnoreCase("Left")) {
            String str2 = hfm.f109324i;
            if (str2 != null && !str2.isEmpty() && hfm.f109324i.equalsIgnoreCase("Right")) {
                layoutParams.addRule(21);
            }
        } else {
            layoutParams.addRule(20);
        }
        this.f13414g.setLayoutParams(layoutParams);
        this.f13414g.setOnClickListener(new ViewOnClickListenerC3846c());
        this.f13415h = (Button) findViewById(scc0.f167212a);
        this.f13416i = (LinearLayout) findViewById(scc0.f167233v);
        this.f13418k = (CheckBox) findViewById(scc0.f167214c);
        this.f13417j = (TextView) findViewById(scc0.f167235x);
        this.f13417j.setText(m19151V0(getString(R$string.f13456a), getString(R$string.f13457b)));
        this.f13417j.setMovementMethod(LinkMovementMethod.getInstance());
        this.f13418k.setOnCheckedChangeListener(new C3847d());
        this.f13415h.setOnClickListener(new ViewOnClickListenerC3848e());
        this.f13417j.setOnClickListener(new ViewOnClickListenerC3849f());
        if (strM97454h == null || strM97457i == null || TextUtils.isEmpty(strM97454h) || TextUtils.isEmpty(strM97457i)) {
            m19159R0(true);
            this.f13416i.setVisibility(8);
        } else {
            m19159R0(false);
            this.f13416i.setVisibility(0);
        }
        LayoutInflater layoutInflater = getLayoutInflater();
        this.f13412e = new ArrayList();
        String strM97437b0 = afm.m97360H().m97437b0();
        afm.m97360H().m97458i0();
        o6r0.m166282b("CardGuideActivity", "getOcrModels:" + this.f13420m.m97437b0());
        String strM97458i0 = afm.m97360H().m97458i0();
        NfcConfigRes nfcConfigResM97396L = afm.m97360H().m97396L();
        if (ffm.f98804g.equals(strM97458i0)) {
            this.f13412e.add(m19148S0(layoutInflater));
            if (nfcConfigResM97396L != null && nfcConfigResM97396L.getNfcMode() != null && "1".equals(nfcConfigResM97396L.getNfcMode())) {
                m19147Q0(strM97437b0, layoutInflater);
            }
        } else {
            m19147Q0(strM97437b0, layoutInflater);
            afm afmVar = this.f13420m;
            if (afmVar != null && afmVar.m97489t() != null && (this.f13420m.m97442d("OCR_ID_FACE_3D") || this.f13420m.m97442d("OCR_ID_BACK_3D"))) {
                View viewInflate = layoutInflater.inflate(eec0.f93638g, (ViewGroup) null);
                TextView textView = (TextView) viewInflate.findViewById(scc0.f167237z);
                TextView textView2 = (TextView) viewInflate.findViewById(scc0.f167236y);
                ((ImageView) viewInflate.findViewById(scc0.f167231t)).setImageDrawable(getResources().getDrawable(zac0.f203549c));
                textView.setText(getResources().getString(com.idv.identity.base.R$string.f12747c));
                textView2.setText(getResources().getString(com.idv.identity.base.R$string.f12747c));
                m19156j1(textView, textView2);
                this.f13412e.add(viewInflate);
            }
        }
        afm afmVar2 = this.f13420m;
        if (afmVar2 != null && afmVar2.m97489t() != null && (this.f13420m.m97442d("OCR_ID_FACE_3D") || this.f13420m.m97442d("OCR_ID_BACK_3D"))) {
            View viewInflate2 = layoutInflater.inflate(eec0.f93638g, (ViewGroup) null);
            TextView textView3 = (TextView) viewInflate2.findViewById(scc0.f167237z);
            TextView textView4 = (TextView) viewInflate2.findViewById(scc0.f167236y);
            ((ImageView) viewInflate2.findViewById(scc0.f167231t)).setImageDrawable(getResources().getDrawable(zac0.f203549c));
            textView3.setText(getResources().getString(com.idv.identity.base.R$string.f12747c));
            textView4.setText(getResources().getString(com.idv.identity.base.R$string.f12745b));
            m19156j1(textView3, textView4);
            this.f13412e.add(viewInflate2);
        }
        this.f13412e.size();
        C3850g c3850g = new C3850g();
        this.f13413f = c3850g;
        this.f13410c.setAdapter(c3850g);
        this.f13411d.setIndicatorItemCount(this.f13413f.getCount());
        this.f13410c.m4187d(new C3851h());
    }

    @Override // com.idv.identity.platform.IntlFaceBaseActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        String.valueOf((System.currentTimeMillis() - this.f13419l) / 1000.0d);
    }
}
