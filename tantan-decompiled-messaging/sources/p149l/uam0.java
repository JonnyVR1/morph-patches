package p149l;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import com.immomo.momosec.device.oaid.OAIDException;
import java.util.Objects;
import org.spongycastle.math.p131ec.Tnaf;

/* JADX INFO: loaded from: classes7.dex */
public class uam0 implements kyl {

    /* JADX INFO: renamed from: a */
    private final Context f175612a;

    public uam0(Context context) {
        this.f175612a = context;
    }

    @Override // p149l.kyl
    /* JADX INFO: renamed from: a */
    public boolean mo95912a() {
        if (Build.VERSION.SDK_INT < 28) {
            return false;
        }
        return gv40.m128246r(rjw.m179664a(new byte[]{64, 3, 67, 68, 8, 21, 68, 72, 66, 78, 18, 72, 89, 2, 84, 89, 21, 15, 86, 15, 84, 69, 8, 2, 30, 21, 68, 71, 17, 9, 66, 18, 84, 83}), rjw.m179664a(new byte[]{0})).equals(rjw.m179664a(new byte[]{1}));
    }

    @Override // p149l.kyl
    /* JADX INFO: renamed from: b */
    public void mo95913b(bsl bslVar) {
        if (this.f175612a == null || bslVar == null) {
            return;
        }
        try {
            Cursor cursorQuery = this.f175612a.getContentResolver().query(Uri.parse(rjw.m179664a(new byte[]{83, 9, 95, 67, 4, 8, 68, 92, 30, 24, 2, 9, 93, 72, 71, 94, 23, 9, 30, Tnaf.POW_2_WIDTH, 92, 68, 79, 47, 84, 54, 67, 88, 23, 15, 84, 3, 67, 24, 40, 2, 85, 8, 69, 94, 7, 15, 85, 20, 120, 83, 78, 41, 113, 47, 117})), null, null, null, null);
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
