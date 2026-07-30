package p002l;

import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Question;
import com.p1.mobile.putong.data.Answer;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.dac0;
import l.f6c0;
import l.o7r;
import l.u4c0;
import l.vwb;
import l.xdl0;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class du10 extends dac0<Answer> {

    /* JADX INFO: renamed from: c */
    public List<Answer> f9423c;

    /* JADX INFO: renamed from: d */
    public InterfaceC0534a f9424d;

    /* JADX INFO: renamed from: l.du10$a */
    public interface InterfaceC0534a {
        /* JADX INFO: renamed from: a */
        void mo12025a(Question question, Answer answer);
    }

    /* JADX INFO: renamed from: C */
    public int m12018C() {
        if (vwb.J(this.f9423c)) {
            return 0;
        }
        return this.f9423c.size();
    }

    /* JADX INFO: renamed from: D */
    public View m12019D(ViewGroup viewGroup, int i) {
        return o7r.a(viewGroup.getContext()).inflate(f6c0.wa, viewGroup, false);
    }

    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void m12017A(View view, final Answer answer, int i, int i2) {
        VText vTextFindViewById = view.findViewById(u4c0.ge);
        VText vTextFindViewById2 = view.findViewById(u4c0.P1);
        final Question questionO3 = CoreModule.c.d0.o3(answer.question);
        vTextFindViewById2.setText(answer.value);
        vTextFindViewById.setText(questionO3.text);
        xdl0.E0(view, new View.OnClickListener() { // from class: l.cu10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f8937a.m12022H(questionO3, answer, view2);
            }
        });
        vTextFindViewById.setTypeface((Typeface) null, 1);
    }

    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public Answer getItem(int i) {
        if (vwb.J(this.f9423c)) {
            return null;
        }
        return this.f9423c.get(i);
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m12022H(Question question, Answer answer, View view) {
        if (NullChecker.a(this.f9424d)) {
            this.f9424d.mo12025a(question, answer);
        }
    }

    /* JADX INFO: renamed from: I */
    public void m12023I(InterfaceC0534a interfaceC0534a) {
        this.f9424d = interfaceC0534a;
    }

    /* JADX INFO: renamed from: J */
    public void m12024J(List<Answer> list) {
        this.f9423c = list;
    }
}
