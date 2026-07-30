package p149l;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.LoopEditInfo;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.LoopFragmentFactory;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.LoopInputType;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.base.LoopSelectFillData;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.input.ProfileLoopCreateTagAct;
import com.p046p1.mobile.putong.core.profile.R$string;
import com.p046p1.mobile.putong.data.Tag;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public class hia0 extends jq2<jia0> {

    /* JADX INFO: renamed from: a */
    public ArrayList<LoopSelectFillData> f107895a;

    /* JADX INFO: renamed from: b */
    public LoopEditInfo f107896b;

    public hia0(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: renamed from: j0 */
    private int m131240j0() {
        int i = 0;
        for (LoopSelectFillData loopSelectFillData : this.f107895a) {
            if (!loopSelectFillData.m51579e() && loopSelectFillData.m51580f()) {
                i++;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: k0 */
    private void m131241k0() {
        if (!NullChecker.m81303a(ura.m195053e().m195057d().mo33757Uc())) {
            act().m66873d2();
            return;
        }
        LoopEditInfo loopEditInfo = (LoopEditInfo) act().getIntent().getSerializableExtra("loop_create_tag_info");
        this.f107896b = loopEditInfo;
        LoopInputType loopInputType = loopEditInfo.loopInputType;
        this.f107895a = LoopFragmentFactory.m51495p(loopInputType, ura.m195053e().m195057d().mo33757Uc());
        ((jia0) this.viewModel).m141647i(loopInputType.title);
        ((jia0) this.viewModel).m141646f(this.f107895a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l0 */
    public /* synthetic */ void m131242l0(Bundle bundle) {
        m131241k0();
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: Z */
    public void mo39469Z() {
        super.mo39469Z();
        creates(new e30() { // from class: l.gia0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f102870a.m131242l0((Bundle) obj);
            }
        });
    }

    @Override // p149l.jq2, p149l.q0m
    /* JADX INFO: renamed from: f0, reason: merged with bridge method [inline-methods] */
    public void mo51532C(jia0 jia0Var) {
        super.mo51532C(jia0Var);
    }

    /* JADX INFO: renamed from: g0 */
    public void m131244g0() {
        if (NullChecker.m81303a(this.f107896b)) {
            LoopInputType loopInputType = this.f107896b.loopInputType;
            if (loopInputType == LoopInputType.PERSONALITY) {
                zvf0.m220396r("e_personality_selection_save", loopInputType.pageId);
            } else {
                zvf0.m220396r("e_interests_selection_save", loopInputType.pageId);
            }
        }
        Intent intent = new Intent();
        m131246i0();
        act().setResult(-1, intent);
        act().m66873d2();
    }

    /* JADX INFO: renamed from: h0 */
    public final void m131245h0(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Iterator<Tag> it = ura.m195053e().m195057d().mo33757Uc().profile.tags.iterator();
        while (it.hasNext()) {
            if (TextUtils.equals(str, it.next().category)) {
                it.remove();
            }
        }
        for (LoopSelectFillData loopSelectFillData : this.f107895a) {
            if (!loopSelectFillData.m51579e() && loopSelectFillData.m51580f()) {
                Tag tag = new Tag();
                tag.category = str;
                tag.value = loopSelectFillData.m51575a();
                ura.m195053e().m195057d().mo33757Uc().profile.tags.add(tag);
            }
        }
    }

    /* JADX INFO: renamed from: i0 */
    public void m131246i0() {
        if (NullChecker.m81303a(ura.m195053e().m195057d().mo33757Uc())) {
            m131245h0(this.f107896b.loopInputType.tagKey);
        }
    }

    /* JADX INFO: renamed from: m0 */
    public void m131247m0(int i, int i2, Intent intent) {
        if (NullChecker.m81303a(intent) && i2 == -1) {
            String stringExtra = intent.getStringExtra("loop_result_key");
            if (TextUtils.isEmpty(stringExtra)) {
                return;
            }
            LoopSelectFillData loopSelectFillData = new LoopSelectFillData(stringExtra);
            loopSelectFillData.m51581g().m51583i(true);
            this.f107895a.add(1, loopSelectFillData);
            ((jia0) this.viewModel).m141646f(this.f107895a);
        }
    }

    /* JADX INFO: renamed from: n0 */
    public void m131248n0(int i) {
        LoopSelectFillData loopSelectFillData = this.f107895a.get(i);
        int iM131240j0 = m131240j0();
        if (loopSelectFillData.m51579e()) {
            if (iM131240j0 >= 10) {
                lsi0.m151578h(R$string.f27689B2);
                return;
            } else {
                ((jia0) this.viewModel).getAct().startActivityForResult(ProfileLoopCreateTagAct.m51638b2(this.f107896b, m142773Y()), 0);
            }
        } else {
            if (!loopSelectFillData.m51580f() && iM131240j0 + 1 > 10) {
                lsi0.m151578h(R$string.f27689B2);
                return;
            }
            loopSelectFillData.m51583i(!loopSelectFillData.m51580f());
        }
        ((jia0) this.viewModel).m141646f(this.f107895a);
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
