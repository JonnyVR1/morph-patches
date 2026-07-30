package p153l;

import android.content.Context;
import android.os.Bundle;
import android.view.View;

/* JADX INFO: loaded from: classes7.dex */
public class qfm extends if2 {

    /* JADX INFO: renamed from: l.qfm$a */
    public class ViewOnClickListenerC19563a implements View.OnClickListener {
        public ViewOnClickListenerC19563a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            qfm.this.dismiss();
        }
    }

    /* JADX INFO: renamed from: l.qfm$b */
    public class ViewOnClickListenerC19564b implements View.OnClickListener {
        public ViewOnClickListenerC19564b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            qfm.this.dismiss();
        }
    }

    public qfm(Context context) {
        super(context, eec0.f93636e);
    }

    @Override // p153l.if2, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        findViewById(scc0.f167232u).setOnClickListener(new ViewOnClickListenerC19563a());
        findViewById(scc0.f167213b).setOnClickListener(new ViewOnClickListenerC19564b());
    }
}
