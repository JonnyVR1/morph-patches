package p149l;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.immomo.momosec.device.oaid.OAIDException;
import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
public class q7y implements kyl {

    /* JADX INFO: renamed from: a */
    private final Context f153096a;

    public q7y(Context context) {
        this.f153096a = context;
    }

    @Override // p149l.kyl
    /* JADX INFO: renamed from: a */
    public boolean mo95912a() {
        Context context = this.f153096a;
        if (context == null) {
            return false;
        }
        try {
            return context.getPackageManager().resolveContentProvider(rjw.m179664a(new byte[]{83, 9, 92, 25, 12, 3, 89, 28, 68, 25, 7, 10, 73, 11, 84, 25, 14, 22, 85, 8, 88, 83, 18, 2, 91}), 0) != null;
        } catch (Exception unused) {
        }
    }

    @Override // p149l.kyl
    /* JADX INFO: renamed from: b */
    public void mo95913b(bsl bslVar) {
        if (this.f153096a == null || bslVar == null) {
            return;
        }
        try {
            Cursor cursorQuery = this.f153096a.getContentResolver().query(Uri.parse(rjw.m179664a(new byte[]{83, 9, 95, 67, 4, 8, 68, 92, 30, 24, 2, 9, 93, 72, 92, 82, 8, 28, 69, 72, 87, 91, 24, 11, 85, 72, 94, 71, 4, 8, 89, 2, 66, 83, 10, 73})), null, null, new String[]{rjw.m179664a(new byte[]{95, 7, 88, 83})}, null);
            Objects.requireNonNull(cursorQuery);
            cursorQuery.moveToFirst();
            String string = cursorQuery.getString(cursorQuery.getColumnIndex(rjw.m179664a(new byte[]{70, 7, 93, 66, 4})));
            if (string == null || string.length() == 0) {
                throw new OAIDException(rjw.m179664a(new byte[]{127, 39, 120, 115, 65, 23, 69, 3, 67, 78, 65, 0, 81, 15, 93, 82, 5}));
            }
            kjw.m146278a(rjw.m179664a(new byte[]{127, 39, 120, 115, 65, 23, 69, 3, 67, 78, 65, 21, 69, 5, 82, 82, 18, 21, 10, 70}) + string);
            bslVar.mo103720a(string);
            cursorQuery.close();
        } catch (Exception e) {
            bslVar.mo103721b(e);
        }
    }
}
