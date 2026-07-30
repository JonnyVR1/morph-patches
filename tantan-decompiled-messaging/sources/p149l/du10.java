package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Question;
import com.p046p1.mobile.putong.data.Answer;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class du10 extends dac0<Answer> {

    /* JADX INFO: renamed from: c */
    public List<Answer> f87946c;

    /* JADX INFO: renamed from: d */
    public InterfaceC16471a f87947d;

    /* JADX INFO: renamed from: l.du10$a */
    public interface InterfaceC16471a {
        /* JADX INFO: renamed from: a */
        void mo113669a(Question question, Answer answer);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        if (vwb.m200296J(this.f87946c)) {
            return 0;
        }
        return this.f87946c.size();
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: D */
    public View mo28825D(ViewGroup viewGroup, int i) {
        return o7r.m163037a(viewGroup.getContext()).inflate(f6c0.f96066wa, viewGroup, false);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void mo28823A(View view, final Answer answer, int i, int i2) {
        VText vText = (VText) view.findViewById(u4c0.f174268ge);
        VText vText2 = (VText) view.findViewById(u4c0.f173973P1);
        final Question questionM215900o3 = CoreModule.f17545c.f19636d0.m215900o3(answer.question);
        vText2.setText(answer.value);
        vText.setText(questionM215900o3.text);
        xdl0.m208329E0(view, new View.OnClickListener() { // from class: l.cu10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f82519a.m113666H(questionM215900o3, answer, view2);
            }
        });
        vText.setTypeface(null, 1);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public Answer getItem(int i) {
        if (vwb.m200296J(this.f87946c)) {
            return null;
        }
        return this.f87946c.get(i);
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m113666H(Question question, Answer answer, View view) {
        if (NullChecker.m81303a(this.f87947d)) {
            this.f87947d.mo113669a(question, answer);
        }
    }

    /* JADX INFO: renamed from: I */
    public void m113667I(InterfaceC16471a interfaceC16471a) {
        this.f87947d = interfaceC16471a;
    }

    /* JADX INFO: renamed from: J */
    public void m113668J(List<Answer> list) {
        this.f87946c = list;
    }
}
