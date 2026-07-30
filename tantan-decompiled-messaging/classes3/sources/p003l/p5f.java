package p003l;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.google.android.material.R;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.Dialog;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.message.inner.view.MessageWheelPicker;
import java.util.ArrayList;
import java.util.List;
import l.cwf0;
import l.i0e;
import l.j760;
import l.l5j0;
import l.l6c0;
import l.o7r;
import l.x7c0;
import l.xdl0;
import l.y4c0;
import l.zvf0;
import p028v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class p5f extends l5j0 {

    /* JADX INFO: renamed from: f */
    public MessageWheelPicker f6314f;

    /* JADX INFO: renamed from: g */
    public List<Integer> f6315g;

    /* JADX INFO: renamed from: h */
    public int f6316h;

    /* JADX INFO: renamed from: l.p5f$b */
    public class DialogInterfaceOnDismissListenerC0468b implements DialogInterface.OnDismissListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ cwf0 f6318a;

        public DialogInterfaceOnDismissListenerC0468b(cwf0 cwf0Var) {
            this.f6318a = cwf0Var;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            i0e.e(this.f6318a);
        }
    }

    public p5f(@NonNull Context context) {
        super(context, x7c0.b);
        this.f6316h = 15;
        this.f6315g = new ArrayList();
        for (int i = 15; i <= 60; i += 15) {
            this.f6315g.add(Integer.valueOf(i));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public /* synthetic */ void m6794C(View view) {
        dismiss();
    }

    /* JADX INFO: renamed from: D */
    public final /* synthetic */ void m6798D(String str, View view) {
        CoreModule.c.M1.D3(str, this.f6316h);
        dismiss();
        zvf0.u("e_send_private_chat_invite", "p_private_chat_invite", new j760[]{j760.a("private_chat_duration", this.f6316h + "")});
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: E */
    public void m6799E(Act act, final String str) {
        View viewInflate = o7r.a(act).inflate(l6c0.P3, (ViewGroup) null);
        this.f6314f = viewInflate.findViewById(y4c0.G4);
        xdl0.E0(viewInflate.findViewById(y4c0.P), new View.OnClickListener() { // from class: l.n5f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f5834a.m6794C(view);
            }
        });
        xdl0.E0(viewInflate.findViewById(y4c0.b), new View.OnClickListener() { // from class: l.o5f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f6042a.m6798D(str, view);
            }
        });
        ((VText) viewInflate.findViewById(y4c0.Q4)).getPaint().setFakeBoldText(true);
        ArrayList arrayList = new ArrayList();
        for (Integer num : this.f6315g) {
            if (num.intValue() == 60) {
                arrayList.add("1小时");
            } else {
                arrayList.add(num.toString() + "分钟");
            }
        }
        this.f6314f.setData(arrayList);
        this.f6314f.setOnWheelChangeListener(new C0467a());
        cwf0 cwf0VarC = i0e.c("p_private_chat_invite", Dialog.class.getName());
        i0e.f(cwf0VarC);
        setOnDismissListener(new DialogInterfaceOnDismissListenerC0468b(cwf0VarC));
        setContentView(viewInflate);
        show();
        setCancelable(false);
        BottomSheetBehavior.from(findViewById(R.id.design_bottom_sheet)).setState(3);
    }

    /* JADX INFO: renamed from: l.p5f$a */
    public class C0467a implements MessageWheelPicker.b {
        public C0467a() {
        }

        /* JADX INFO: renamed from: a */
        public void m6800a(int i) {
            p5f p5fVar = p5f.this;
            p5fVar.f6316h = ((Integer) p5fVar.f6315g.get(i)).intValue();
        }

        /* JADX INFO: renamed from: b */
        public void m6801b(int i) {
        }

        /* JADX INFO: renamed from: c */
        public void m6802c(int i) {
        }
    }
}
