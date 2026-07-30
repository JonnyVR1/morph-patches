package com.p000p1.mobile.putong.core.p001ui.profile.loop.input;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.LoopEditInfo;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.LoopInputType;
import com.p000p1.mobile.putong.core.p001ui.profile.views.ProfileLoopEditActionView;
import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.profile.R;
import com.tantanapp.common.utils.NullChecker;
import l.cfa0;
import l.e30;
import l.e3c0;
import l.e51;
import l.lsi0;
import l.t100;
import l.xdl0;
import l.zvf0;
import p002l.yha0;
import v.VButton;
import v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ProfileLoopCreateTagAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public VNavigationBar f1325c;

    /* JADX INFO: renamed from: d */
    public ProfileLoopEditActionView f1326d;

    /* JADX INFO: renamed from: e */
    public VButton f1327e;

    /* JADX INFO: renamed from: f */
    public LoopEditInfo f1328f;

    /* JADX INFO: renamed from: b2 */
    public static Intent m2131b2(LoopEditInfo loopEditInfo, Context context) {
        Intent intent = new Intent(context, (Class<?>) ProfileLoopCreateTagAct.class);
        intent.putExtra("loop_create_tag_info", loopEditInfo);
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d2 */
    public /* synthetic */ void m2132d2(Bundle bundle) {
        m2135r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e2 */
    public /* synthetic */ void m2133e2(View view) {
        m2137c2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h2 */
    public /* synthetic */ void m2134h2() {
        this.f1326d.f1993e.requestFocus();
        act().showInput(this.f1326d.f1993e, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: r */
    private void m2135r() {
        xdl0.E0(this.f1327e, new View.OnClickListener() { // from class: l.zea0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f23357a.m2133e2(view);
            }
        });
        if (NullChecker.a(this.f1328f) && !this.f1328f.couldInputEmpty && TextUtils.isEmpty(this.f1326d.getInputValue())) {
            this.f1327e.setEnabled(false);
            this.f1327e.setClickable(false);
            this.f1327e.setBackground(getResources().getDrawable(e3c0.r1));
        }
        this.f1325c.setLeftIconAsBack(this);
        this.f1326d.setInputTextChangeListener(new ProfileLoopEditActionView.InterfaceC0171b() { // from class: l.afa0
            @Override // com.p000p1.mobile.putong.core.p001ui.profile.views.ProfileLoopEditActionView.InterfaceC0171b
            /* JADX INFO: renamed from: a */
            public final void mo3536a(String str, String str2) {
                this.f7531a.m2138g2(str, str2);
            }
        });
        this.f1326d.m3531c(this.f1328f);
        xdl0.M0(this.f1326d.f1989a, true);
        this.f1326d.f1989a.setText(this.f1328f.title);
        if (this.f1326d.f1992d.getVisibility() == 0) {
            xdl0.C0(this.f1326d.f1991c, t100.d(200.0f));
        }
        e51.H(this, new Runnable() { // from class: l.bfa0
            @Override // java.lang.Runnable
            public final void run() {
                this.f8101a.m2134h2();
            }
        }, 300L);
        xdl0.M(this.f1326d.f1996h, false);
    }

    /* JADX INFO: renamed from: a2 */
    public View m2136a2(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return cfa0.b(this, layoutInflater, viewGroup);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c2 */
    public final void m2137c2() {
        String inputValue = this.f1326d.getInputValue();
        if (yha0.m26718b(inputValue)) {
            lsi0.y(CoreModule.b.getString(R.string.k0));
            return;
        }
        if (!TextUtils.isEmpty(inputValue) || this.f1328f.couldInputEmpty) {
            m2139i2();
            hideInput();
            Intent intent = new Intent();
            intent.putExtra("loop_result_key", inputValue);
            intent.putExtra("loop_create_tag_info", this.f1328f);
            setResult(-1, intent);
            finish();
        }
    }

    /* JADX INFO: renamed from: g2 */
    public final /* synthetic */ void m2138g2(String str, String str2) {
        if (NullChecker.a(this.f1327e)) {
            if (NullChecker.a(this.f1328f) && TextUtils.isEmpty(str2) && this.f1328f.couldInputEmpty) {
                this.f1327e.setEnabled(true);
                this.f1327e.setClickable(true);
                this.f1327e.setBackground(getResources().getDrawable(e3c0.f));
            } else if (TextUtils.isEmpty(str.trim()) || !TextUtils.isEmpty(str2)) {
                this.f1327e.setEnabled(false);
                this.f1327e.setClickable(false);
                this.f1327e.setBackground(getResources().getDrawable(e3c0.r1));
            } else {
                this.f1327e.setEnabled(true);
                this.f1327e.setClickable(true);
                this.f1327e.setBackground(getResources().getDrawable(e3c0.f));
            }
        }
    }

    /* JADX INFO: renamed from: i2 */
    public final void m2139i2() {
        if (NullChecker.a(this.f1328f) && NullChecker.a(this.f1328f.loopInputType)) {
            LoopInputType loopInputType = this.f1328f.loopInputType;
            if (loopInputType == LoopInputType.QUESTION_EDIT || loopInputType == LoopInputType.QUESTION_CHOICE) {
                zvf0.r("e_my_question_edit_answer_save", "p_my_question_edit_answer");
            } else if (loopInputType == LoopInputType.HANGOUTS) {
                zvf0.r("e_edit_hangouts_save", "p_edit_hangouts_view");
            }
            if (this.f1328f.isHarmonyTest) {
                zvf0.r("e_profile_test_question_finish", pageId());
            }
        }
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m2136a2(layoutInflater, viewGroup);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void initDataOnCreate() {
        this.f1328f = (LoopEditInfo) getIntent().getSerializableExtra("loop_create_tag_info");
        super.initDataOnCreate();
        creates(new e30() { // from class: l.yea0
            public final void call(Object obj) {
                this.f22819a.m2132d2((Bundle) obj);
            }
        });
    }

    public void onBackPressed() {
        super/*androidx.activity.ComponentActivity*/.onBackPressed();
        hideInput();
    }

    public String pageId() {
        if (NullChecker.a(this.f1328f) && NullChecker.a(this.f1328f.loopInputType)) {
            LoopInputType loopInputType = this.f1328f.loopInputType;
            if (loopInputType == LoopInputType.INDUSTRY) {
                return "p_edit_custom_industry_view";
            }
            if (loopInputType == LoopInputType.DEPARTMENT) {
                return "p_edit_custom_work_area_view";
            }
            if (loopInputType == LoopInputType.HOMETOWN) {
                return "p_edit_custom_hometown_view";
            }
            if (loopInputType == LoopInputType.QUESTION_EDIT || loopInputType == LoopInputType.QUESTION_CHOICE) {
                return "p_my_question_edit_answer";
            }
            if (loopInputType == LoopInputType.HANGOUTS) {
                return "p_edit_hangouts_view";
            }
        }
        return super.pageId();
    }

    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        if (NullChecker.a(getSupportActionBar())) {
            getSupportActionBar().m();
        }
    }
}
