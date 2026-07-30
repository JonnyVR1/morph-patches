package p153l;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.LoopEditInfo;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.LoopFragmentFactory;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.LoopInputType;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.base.LoopSelectFillData;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.input.ProfileLoopCreateTagAct;
import com.p051p1.mobile.putong.core.profile.R$string;
import com.p051p1.mobile.putong.data.Tag;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public class lqa0 extends ar2<nqa0> {

    /* JADX INFO: renamed from: a */
    public ArrayList<LoopSelectFillData> f133163a;

    /* JADX INFO: renamed from: b */
    public LoopEditInfo f133164b;

    public lqa0(ner nerVar) {
        super(nerVar);
    }

    /* JADX INFO: renamed from: j0 */
    private int m155336j0() {
        int i = 0;
        for (LoopSelectFillData loopSelectFillData : this.f133163a) {
            if (!loopSelectFillData.m52762e() && loopSelectFillData.m52763f()) {
                i++;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: k0 */
    private void m155337k0() {
        if (!NullChecker.m82486a(gta.m132210e().m132214d().mo34760Uc())) {
            act().m68056e2();
            return;
        }
        LoopEditInfo loopEditInfo = (LoopEditInfo) act().getIntent().getSerializableExtra("loop_create_tag_info");
        this.f133164b = loopEditInfo;
        LoopInputType loopInputType = loopEditInfo.loopInputType;
        this.f133163a = LoopFragmentFactory.m52678p(loopInputType, gta.m132210e().m132214d().mo34760Uc());
        ((nqa0) this.viewModel).m164301i(loopInputType.title);
        ((nqa0) this.viewModel).m164300f(this.f133163a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l0 */
    public /* synthetic */ void m155338l0(Bundle bundle) {
        m155337k0();
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: Z */
    public void mo40472Z() {
        super.mo40472Z();
        creates(new y20() { // from class: l.kqa0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f128208a.m155338l0((Bundle) obj);
            }
        });
    }

    @Override // p153l.ar2, p153l.k3m
    /* JADX INFO: renamed from: f0, reason: merged with bridge method [inline-methods] */
    public void mo52715C(nqa0 nqa0Var) {
        super.mo52715C(nqa0Var);
    }

    /* JADX INFO: renamed from: g0 */
    public void m155340g0() {
        if (NullChecker.m82486a(this.f133164b)) {
            LoopInputType loopInputType = this.f133164b.loopInputType;
            if (loopInputType == LoopInputType.PERSONALITY) {
                i4g0.m138520r("e_personality_selection_save", loopInputType.pageId);
            } else {
                i4g0.m138520r("e_interests_selection_save", loopInputType.pageId);
            }
        }
        Intent intent = new Intent();
        m155342i0();
        act().setResult(-1, intent);
        act().m68056e2();
    }

    /* JADX INFO: renamed from: h0 */
    public final void m155341h0(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Iterator<Tag> it = gta.m132210e().m132214d().mo34760Uc().profile.tags.iterator();
        while (it.hasNext()) {
            if (TextUtils.equals(str, it.next().category)) {
                it.remove();
            }
        }
        for (LoopSelectFillData loopSelectFillData : this.f133163a) {
            if (!loopSelectFillData.m52762e() && loopSelectFillData.m52763f()) {
                Tag tag = new Tag();
                tag.category = str;
                tag.value = loopSelectFillData.m52758a();
                gta.m132210e().m132214d().mo34760Uc().profile.tags.add(tag);
            }
        }
    }

    /* JADX INFO: renamed from: i0 */
    public void m155342i0() {
        if (NullChecker.m82486a(gta.m132210e().m132214d().mo34760Uc())) {
            m155341h0(this.f133164b.loopInputType.tagKey);
        }
    }

    /* JADX INFO: renamed from: m0 */
    public void m155343m0(int i, int i2, Intent intent) {
        if (NullChecker.m82486a(intent) && i2 == -1) {
            String stringExtra = intent.getStringExtra("loop_result_key");
            if (TextUtils.isEmpty(stringExtra)) {
                return;
            }
            LoopSelectFillData loopSelectFillData = new LoopSelectFillData(stringExtra);
            loopSelectFillData.m52764g().m52766i(true);
            this.f133163a.add(1, loopSelectFillData);
            ((nqa0) this.viewModel).m164300f(this.f133163a);
        }
    }

    /* JADX INFO: renamed from: n0 */
    public void m155344n0(int i) {
        LoopSelectFillData loopSelectFillData = this.f133163a.get(i);
        int iM155336j0 = m155336j0();
        if (loopSelectFillData.m52762e()) {
            if (iM155336j0 >= 10) {
                o1j0.m165634h(R$string.f28537B2);
                return;
            } else {
                ((nqa0) this.viewModel).getAct().startActivityForResult(ProfileLoopCreateTagAct.m52821c2(this.f133164b, m99640Y()), 0);
            }
        } else {
            if (!loopSelectFillData.m52763f() && iM155336j0 + 1 > 10) {
                o1j0.m165634h(R$string.f28537B2);
                return;
            }
            loopSelectFillData.m52766i(!loopSelectFillData.m52763f());
        }
        ((nqa0) this.viewModel).m164300f(this.f133163a);
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
