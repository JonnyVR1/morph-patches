package p153l;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.google.android.material.C2489R;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.message.inner.view.MessageWheelPicker;
import java.util.ArrayList;
import java.util.List;
import p151v.VText;

/* JADX INFO: loaded from: classes3.dex */
public class t6f extends pej0 {

    /* JADX INFO: renamed from: f */
    public MessageWheelPicker f172331f;

    /* JADX INFO: renamed from: g */
    public List<Integer> f172332g;

    /* JADX INFO: renamed from: h */
    public int f172333h;

    /* JADX INFO: renamed from: l.t6f$b */
    public class DialogInterfaceOnDismissListenerC20249b implements DialogInterface.OnDismissListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ l4g0 f172335a;

        public DialogInterfaceOnDismissListenerC20249b(l4g0 l4g0Var) {
            this.f172335a = l4g0Var;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            w1e.m204401e(this.f172335a);
        }
    }

    public t6f(@NonNull Context context) {
        super(context, cgc0.f81646b);
        this.f172333h = 15;
        this.f172332g = new ArrayList();
        for (int i = 15; i <= 60; i += 15) {
            this.f172332g.add(Integer.valueOf(i));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public /* synthetic */ void m189520C(View view) {
        dismiss();
    }

    /* JADX INFO: renamed from: D */
    public final /* synthetic */ void m189524D(String str, View view) {
        CoreModule.f18264c.f20328M1.m111466D3(str, this.f172333h);
        dismiss();
        i4g0.m138523u("e_send_private_chat_invite", "p_private_chat_invite", pf60.m172085a("private_chat_duration", this.f172333h + ""));
    }

    /* JADX INFO: renamed from: E */
    public void m189525E(Act act, final String str) {
        View viewInflate = p9r.m171370a(act).inflate(qec0.f156920P3, (ViewGroup) null);
        this.f172331f = (MessageWheelPicker) viewInflate.findViewById(edc0.f93207G4);
        bnl0.m105509E0(viewInflate.findViewById(edc0.f93256P), new View.OnClickListener() { // from class: l.r6f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f161466a.m189520C(view);
            }
        });
        bnl0.m105509E0(viewInflate.findViewById(edc0.f93329b), new View.OnClickListener() { // from class: l.s6f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f166562a.m189524D(str, view);
            }
        });
        ((VText) viewInflate.findViewById(edc0.f93267Q4)).getPaint().setFakeBoldText(true);
        ArrayList arrayList = new ArrayList();
        for (Integer num : this.f172332g) {
            if (num.intValue() == 60) {
                arrayList.add("1小时");
            } else {
                arrayList.add(num.toString() + "分钟");
            }
        }
        this.f172331f.setData(arrayList);
        this.f172331f.setOnWheelChangeListener(new C20248a());
        l4g0 l4g0VarM204399c = w1e.m204399c("p_private_chat_invite", Dialog.class.getName());
        w1e.m204402f(l4g0VarM204399c);
        setOnDismissListener(new DialogInterfaceOnDismissListenerC20249b(l4g0VarM204399c));
        setContentView(viewInflate);
        show();
        setCancelable(false);
        BottomSheetBehavior.from(findViewById(C2489R.id.design_bottom_sheet)).setState(3);
    }

    /* JADX INFO: renamed from: l.t6f$a */
    public class C20248a implements MessageWheelPicker.InterfaceC7977b {
        public C20248a() {
        }

        @Override // com.p051p1.mobile.putong.core.message.inner.view.MessageWheelPicker.InterfaceC7977b
        /* JADX INFO: renamed from: a */
        public void mo37021a(int i) {
            t6f t6fVar = t6f.this;
            t6fVar.f172333h = ((Integer) t6fVar.f172332g.get(i)).intValue();
        }

        @Override // com.p051p1.mobile.putong.core.message.inner.view.MessageWheelPicker.InterfaceC7977b
        /* JADX INFO: renamed from: b */
        public void mo37022b(int i) {
        }

        @Override // com.p051p1.mobile.putong.core.message.inner.view.MessageWheelPicker.InterfaceC7977b
        /* JADX INFO: renamed from: c */
        public void mo37023c(int i) {
        }
    }
}
