package p153l;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.putong.app.PutongFrag;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.newui.messages.addressbook.ConversationAddressBookMatchHeadLayout;

/* JADX INFO: loaded from: classes11.dex */
public class g56 extends mi2 {
    public g56(PutongFrag putongFrag) {
        super(putongFrag);
    }

    @Override // p153l.mi2, p153l.jic0
    /* JADX INFO: renamed from: D */
    public View mo29824D(ViewGroup viewGroup, int i) {
        if (i == 1) {
            return this.f136922m.inflater().inflate(kec0.f126041s, viewGroup, false);
        }
        return i == 2 ? this.f136922m.inflater().inflate(kec0.f125400F, viewGroup, false) : super.mo29824D(viewGroup, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.jic0
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public void mo29822A(View view, Conversation conversation, int i, int i2) {
        if (i == 2) {
            ((cj0) view).mo41550a(this, conversation, i2, true);
        } else if (i == 1) {
            ((ConversationAddressBookMatchHeadLayout) view).m42893i(this);
        } else if (i == 0) {
            m129034R(view);
        }
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m129033Q(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        RecyclerView.C0580p c0580p = (RecyclerView.C0580p) view.getLayoutParams();
        ((ViewGroup.MarginLayoutParams) c0580p).topMargin = ((bnl0.m105518J(this.f136922m).y - iArr[1]) - qa00.m175859d(208.0f)) / 2;
        view.setLayoutParams(c0580p);
        this.f136913d.setText("暂时没有新配对");
        this.f136912c.setImageResource(dbc0.f87136k0);
        bnl0.m105524M(view, true);
        bnl0.m105524M(this.f136914e, false);
    }

    /* JADX INFO: renamed from: R */
    public final void m129034R(final View view) {
        view.post(new Runnable() { // from class: l.f56
            @Override // java.lang.Runnable
            public final void run() {
                this.f97192a.m129033Q(view);
            }
        });
    }
}
