package p002l;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.LoopEditInfo;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.LoopFragmentFactory;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.LoopInputType;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.base.LoopSelectFillData;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.input.ProfileLoopCreateTagAct;
import com.p1.mobile.putong.core.profile.R;
import com.p1.mobile.putong.data.Tag;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import l.e30;
import l.jq2;
import l.lsi0;
import l.mcr;
import l.ura;
import l.zvf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class hia0 extends jq2<jia0> {

    /* JADX INFO: renamed from: a */
    public ArrayList<LoopSelectFillData> f12044a;

    /* JADX INFO: renamed from: b */
    public LoopEditInfo f12045b;

    public hia0(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: renamed from: j0 */
    private int m14374j0() {
        int i = 0;
        for (LoopSelectFillData loopSelectFillData : this.f12044a) {
            if (!loopSelectFillData.m2065e() && loopSelectFillData.m2066f()) {
                i++;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: k0 */
    private void m14375k0() {
        if (!NullChecker.a(ura.e().d().Uc())) {
            act().finish();
            return;
        }
        LoopEditInfo loopEditInfo = (LoopEditInfo) act().getIntent().getSerializableExtra("loop_create_tag_info");
        this.f12045b = loopEditInfo;
        LoopInputType loopInputType = loopEditInfo.loopInputType;
        this.f12044a = LoopFragmentFactory.m1977p(loopInputType, ura.e().d().Uc());
        ((jia0) ((jq2) this).viewModel).m15966i(loopInputType.title);
        ((jia0) ((jq2) this).viewModel).m15965f(this.f12044a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l0 */
    public /* synthetic */ void m14376l0(Bundle bundle) {
        m14375k0();
    }

    /* JADX INFO: renamed from: Z */
    public void m14378Z() {
        super.Z();
        creates(new e30() { // from class: l.gia0
            public final void call(Object obj) {
                this.f11448a.m14376l0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: f0, reason: merged with bridge method [inline-methods] */
    public void m14377C(jia0 jia0Var) {
        super.C(jia0Var);
    }

    /* JADX INFO: renamed from: g0 */
    public void m14380g0() {
        if (NullChecker.a(this.f12045b)) {
            LoopInputType loopInputType = this.f12045b.loopInputType;
            if (loopInputType == LoopInputType.PERSONALITY) {
                zvf0.r("e_personality_selection_save", loopInputType.pageId);
            } else {
                zvf0.r("e_interests_selection_save", loopInputType.pageId);
            }
        }
        Intent intent = new Intent();
        m14382i0();
        act().setResult(-1, intent);
        act().finish();
    }

    /* JADX INFO: renamed from: h0 */
    public final void m14381h0(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Iterator it = ura.e().d().Uc().profile.tags.iterator();
        while (it.hasNext()) {
            if (TextUtils.equals(str, ((Tag) it.next()).category)) {
                it.remove();
            }
        }
        for (LoopSelectFillData loopSelectFillData : this.f12044a) {
            if (!loopSelectFillData.m2065e() && loopSelectFillData.m2066f()) {
                Tag tag = new Tag();
                tag.category = str;
                tag.value = loopSelectFillData.m2061a();
                ura.e().d().Uc().profile.tags.add(tag);
            }
        }
    }

    /* JADX INFO: renamed from: i0 */
    public void m14382i0() {
        if (NullChecker.a(ura.e().d().Uc())) {
            m14381h0(this.f12045b.loopInputType.tagKey);
        }
    }

    /* JADX INFO: renamed from: m0 */
    public void m14383m0(int i, int i2, Intent intent) {
        if (NullChecker.a(intent) && i2 == -1) {
            String stringExtra = intent.getStringExtra("loop_result_key");
            if (TextUtils.isEmpty(stringExtra)) {
                return;
            }
            LoopSelectFillData loopSelectFillData = new LoopSelectFillData(stringExtra);
            loopSelectFillData.m2067g().m2069i(true);
            this.f12044a.add(1, loopSelectFillData);
            ((jia0) ((jq2) this).viewModel).m15965f(this.f12044a);
        }
    }

    /* JADX INFO: renamed from: n0 */
    public void m14384n0(int i) {
        LoopSelectFillData loopSelectFillData = this.f12044a.get(i);
        int iM14374j0 = m14374j0();
        if (loopSelectFillData.m2065e()) {
            if (iM14374j0 >= 10) {
                lsi0.h(R.string.B2);
                return;
            } else {
                ((jia0) ((jq2) this).viewModel).act().startActivityForResult(ProfileLoopCreateTagAct.m2131b2(this.f12045b, Y()), 0);
            }
        } else {
            if (!loopSelectFillData.m2066f() && iM14374j0 + 1 > 10) {
                lsi0.h(R.string.B2);
                return;
            }
            loopSelectFillData.m2069i(!loopSelectFillData.m2066f());
        }
        ((jia0) ((jq2) this).viewModel).m15965f(this.f12044a);
    }

    public void destroy() {
    }
}
