package com.p051p1.mobile.putong.core.p058ui.profile.loop.input;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.LoopEditInfo;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.LoopInputType;
import com.p051p1.mobile.putong.core.p058ui.profile.views.ProfileLoopEditActionView;
import com.p051p1.mobile.putong.core.profile.R$string;
import com.tantanapp.common.utils.NullChecker;
import p151v.VButton;
import p151v.navigationbar.VNavigationBar;
import p153l.bnl0;
import p153l.cqa0;
import p153l.gna0;
import p153l.i4g0;
import p153l.kbc0;
import p153l.l51;
import p153l.o1j0;
import p153l.qa00;
import p153l.y20;

/* JADX INFO: loaded from: classes4.dex */
public class ProfileLoopCreateTagAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public VNavigationBar f34351c;

    /* JADX INFO: renamed from: d */
    public ProfileLoopEditActionView f34352d;

    /* JADX INFO: renamed from: e */
    public VButton f34353e;

    /* JADX INFO: renamed from: f */
    public LoopEditInfo f34354f;

    /* JADX INFO: renamed from: c2 */
    public static Intent m52821c2(LoopEditInfo loopEditInfo, Context context) {
        Intent intent = new Intent(context, (Class<?>) ProfileLoopCreateTagAct.class);
        intent.putExtra("loop_create_tag_info", loopEditInfo);
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e2 */
    public /* synthetic */ void m52822e2(Bundle bundle) {
        m52825r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g2 */
    public /* synthetic */ void m52823g2(View view) {
        m52827d2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i2 */
    public /* synthetic */ void m52824i2() {
        this.f34352d.f35019e.requestFocus();
        act().showInput(this.f34352d.f35019e, 0);
    }

    /* JADX INFO: renamed from: r */
    private void m52825r() {
        bnl0.m105509E0(this.f34353e, new View.OnClickListener() { // from class: l.dna0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f89778a.m52823g2(view);
            }
        });
        if (NullChecker.m82486a(this.f34354f) && !this.f34354f.couldInputEmpty && TextUtils.isEmpty(this.f34352d.getInputValue())) {
            this.f34353e.setEnabled(false);
            this.f34353e.setClickable(false);
            this.f34353e.setBackground(getResources().getDrawable(kbc0.f124906r1));
        }
        this.f34351c.setLeftIconAsBack(this);
        this.f34352d.setInputTextChangeListener(new ProfileLoopEditActionView.InterfaceC8909b() { // from class: l.ena0
            @Override // com.p051p1.mobile.putong.core.p058ui.profile.views.ProfileLoopEditActionView.InterfaceC8909b
            /* JADX INFO: renamed from: a */
            public final void mo54161a(String str, String str2) {
                this.f94738a.m52828h2(str, str2);
            }
        });
        this.f34352d.m54156c(this.f34354f);
        bnl0.m105525M0(this.f34352d.f35015a, true);
        this.f34352d.f35015a.setText(this.f34354f.title);
        if (this.f34352d.f35018d.getVisibility() == 0) {
            bnl0.m105505C0(this.f34352d.f35017c, qa00.m175859d(200.0f));
        }
        l51.m152888H(this, new Runnable() { // from class: l.fna0
            @Override // java.lang.Runnable
            public final void run() {
                this.f99882a.m52824i2();
            }
        }, 300L);
        bnl0.m105524M(this.f34352d.f35022h, false);
    }

    /* JADX INFO: renamed from: b2 */
    public View m52826b2(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return gna0.m130849b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: d2 */
    public final void m52827d2() {
        String inputValue = this.f34352d.getInputValue();
        if (cqa0.m111887b(inputValue)) {
            o1j0.m165651y(CoreModule.f18263b.getString(R$string.f28724k0));
            return;
        }
        if (!TextUtils.isEmpty(inputValue) || this.f34354f.couldInputEmpty) {
            m52829k2();
            hideInput();
            Intent intent = new Intent();
            intent.putExtra("loop_result_key", inputValue);
            intent.putExtra("loop_create_tag_info", this.f34354f);
            setResult(-1, intent);
            m51642n2();
        }
    }

    /* JADX INFO: renamed from: h2 */
    public final /* synthetic */ void m52828h2(String str, String str2) {
        if (NullChecker.m82486a(this.f34353e)) {
            if (NullChecker.m82486a(this.f34354f) && TextUtils.isEmpty(str2) && this.f34354f.couldInputEmpty) {
                this.f34353e.setEnabled(true);
                this.f34353e.setClickable(true);
                this.f34353e.setBackground(getResources().getDrawable(kbc0.f124866f));
            } else if (TextUtils.isEmpty(str.trim()) || !TextUtils.isEmpty(str2)) {
                this.f34353e.setEnabled(false);
                this.f34353e.setClickable(false);
                this.f34353e.setBackground(getResources().getDrawable(kbc0.f124906r1));
            } else {
                this.f34353e.setEnabled(true);
                this.f34353e.setClickable(true);
                this.f34353e.setBackground(getResources().getDrawable(kbc0.f124866f));
            }
        }
    }

    @Override // com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m52826b2(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initDataOnCreate() {
        this.f34354f = (LoopEditInfo) getIntent().getSerializableExtra("loop_create_tag_info");
        super.initDataOnCreate();
        creates(new y20() { // from class: l.cna0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f82706a.m52822e2((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: k2 */
    public final void m52829k2() {
        if (NullChecker.m82486a(this.f34354f) && NullChecker.m82486a(this.f34354f.loopInputType)) {
            LoopInputType loopInputType = this.f34354f.loopInputType;
            if (loopInputType == LoopInputType.QUESTION_EDIT || loopInputType == LoopInputType.QUESTION_CHOICE) {
                i4g0.m138520r("e_my_question_edit_answer_save", "p_my_question_edit_answer");
            } else if (loopInputType == LoopInputType.HANGOUTS) {
                i4g0.m138520r("e_edit_hangouts_save", "p_edit_hangouts_view");
            }
            if (this.f34354f.isHarmonyTest) {
                i4g0.m138520r("e_profile_test_question_finish", pageId());
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        hideInput();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        if (NullChecker.m82486a(this.f34354f) && NullChecker.m82486a(this.f34354f.loopInputType)) {
            LoopInputType loopInputType = this.f34354f.loopInputType;
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

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        if (NullChecker.m82486a(getSupportActionBar())) {
            getSupportActionBar().mo102186m();
        }
    }
}
