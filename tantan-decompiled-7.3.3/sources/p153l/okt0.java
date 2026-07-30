package p153l;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.MutableContextWrapper;
import androidx.annotation.Nullable;
import io.requery.android.database.sqlite.SQLiteDatabase;

/* JADX INFO: loaded from: classes6.dex */
public final class okt0 extends MutableContextWrapper {

    /* JADX INFO: renamed from: a */
    @Nullable
    public Activity f147784a;

    /* JADX INFO: renamed from: b */
    public Context f147785b;

    /* JADX INFO: renamed from: c */
    public Context f147786c;

    public okt0(Context context) {
        super(context);
        setBaseContext(context);
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public final Activity m168051a() {
        return this.f147784a;
    }

    /* JADX INFO: renamed from: b */
    public final Context m168052b() {
        return this.f147786c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        return this.f147786c.getSystemService(str);
    }

    @Override // android.content.MutableContextWrapper
    public final void setBaseContext(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f147785b = applicationContext;
        this.f147784a = context instanceof Activity ? (Activity) context : null;
        this.f147786c = context;
        super.setBaseContext(applicationContext);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void startActivity(Intent intent) {
        Activity activity = this.f147784a;
        if (activity != null) {
            activity.startActivity(intent);
        } else {
            intent.setFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
            this.f147785b.startActivity(intent);
        }
    }
}
