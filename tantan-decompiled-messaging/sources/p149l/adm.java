package p149l;

import android.content.Context;
import android.os.Bundle;
import android.view.View;

/* JADX INFO: loaded from: classes7.dex */
public class adm extends bf2 {

    /* JADX INFO: renamed from: l.adm$a */
    public class ViewOnClickListenerC15584a implements View.OnClickListener {
        public ViewOnClickListenerC15584a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            adm.this.dismiss();
        }
    }

    /* JADX INFO: renamed from: l.adm$b */
    public class ViewOnClickListenerC15585b implements View.OnClickListener {
        public ViewOnClickListenerC15585b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            adm.this.dismiss();
        }
    }

    public adm(Context context) {
        super(context, y5c0.f196411e);
    }

    @Override // p149l.bf2, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        findViewById(l4c0.f126012u).setOnClickListener(new ViewOnClickListenerC15584a());
        findViewById(l4c0.f125993b).setOnClickListener(new ViewOnClickListenerC15585b());
    }
}
