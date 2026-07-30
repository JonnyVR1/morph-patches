package p149l;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.google.android.material.C2466R;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.message.inner.view.MessageWheelPicker;
import java.util.ArrayList;
import java.util.List;
import p147v.VText;

/* JADX INFO: loaded from: classes3.dex */
public class p5f extends l5j0 {

    /* JADX INFO: renamed from: f */
    public MessageWheelPicker f147290f;

    /* JADX INFO: renamed from: g */
    public List<Integer> f147291g;

    /* JADX INFO: renamed from: h */
    public int f147292h;

    /* JADX INFO: renamed from: l.p5f$b */
    public class DialogInterfaceOnDismissListenerC19138b implements DialogInterface.OnDismissListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ cwf0 f147294a;

        public DialogInterfaceOnDismissListenerC19138b(cwf0 cwf0Var) {
            this.f147294a = cwf0Var;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            i0e.m133796e(this.f147294a);
        }
    }

    public p5f(@NonNull Context context) {
        super(context, x7c0.f191333b);
        this.f147292h = 15;
        this.f147291g = new ArrayList();
        for (int i = 15; i <= 60; i += 15) {
            this.f147291g.add(Integer.valueOf(i));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public /* synthetic */ void m167476C(View view) {
        dismiss();
    }

    /* JADX INFO: renamed from: D */
    public final /* synthetic */ void m167480D(String str, View view) {
        CoreModule.f17545c.f19586M1.m215241D3(str, this.f147292h);
        dismiss();
        zvf0.m220399u("e_send_private_chat_invite", "p_private_chat_invite", j760.m140076a("private_chat_duration", this.f147292h + ""));
    }

    /* JADX INFO: renamed from: E */
    public void m167481E(Act act, final String str) {
        View viewInflate = o7r.m163037a(act).inflate(l6c0.f126364P3, (ViewGroup) null);
        this.f147290f = (MessageWheelPicker) viewInflate.findViewById(y4c0.f195972G4);
        xdl0.m208329E0(viewInflate.findViewById(y4c0.f196021P), new View.OnClickListener() { // from class: l.n5f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f137208a.m167476C(view);
            }
        });
        xdl0.m208329E0(viewInflate.findViewById(y4c0.f196094b), new View.OnClickListener() { // from class: l.o5f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f141894a.m167480D(str, view);
            }
        });
        ((VText) viewInflate.findViewById(y4c0.f196032Q4)).getPaint().setFakeBoldText(true);
        ArrayList arrayList = new ArrayList();
        for (Integer num : this.f147291g) {
            if (num.intValue() == 60) {
                arrayList.add("1小时");
            } else {
                arrayList.add(num.toString() + "分钟");
            }
        }
        this.f147290f.setData(arrayList);
        this.f147290f.setOnWheelChangeListener(new C19137a());
        cwf0 cwf0VarM133794c = i0e.m133794c("p_private_chat_invite", Dialog.class.getName());
        i0e.m133797f(cwf0VarM133794c);
        setOnDismissListener(new DialogInterfaceOnDismissListenerC19138b(cwf0VarM133794c));
        setContentView(viewInflate);
        show();
        setCancelable(false);
        BottomSheetBehavior.from(findViewById(C2466R.id.design_bottom_sheet)).setState(3);
    }

    /* JADX INFO: renamed from: l.p5f$a */
    public class C19137a implements MessageWheelPicker.InterfaceC7826b {
        public C19137a() {
        }

        @Override // com.p046p1.mobile.putong.core.message.inner.view.MessageWheelPicker.InterfaceC7826b
        /* JADX INFO: renamed from: a */
        public void mo36018a(int i) {
            p5f p5fVar = p5f.this;
            p5fVar.f147292h = ((Integer) p5fVar.f147291g.get(i)).intValue();
        }

        @Override // com.p046p1.mobile.putong.core.message.inner.view.MessageWheelPicker.InterfaceC7826b
        /* JADX INFO: renamed from: b */
        public void mo36019b(int i) {
        }

        @Override // com.p046p1.mobile.putong.core.message.inner.view.MessageWheelPicker.InterfaceC7826b
        /* JADX INFO: renamed from: c */
        public void mo36020c(int i) {
        }
    }
}
