package p153l;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.p051p1.mobile.putong.data.User;
import com.tencent.mmkv.MMKV;
import com.xiaomi.mipush.sdk.MiPushClient;
import com.xiaomi.push.C14896gn;
import com.xiaomi.push.C14907gy;
import com.xiaomi.push.C14914he;
import com.xiaomi.push.C14936m;
import com.xiaomi.push.EnumC14888gf;
import com.xiaomi.push.EnumC14890gh;
import com.xiaomi.push.EnumC14893gk;
import com.xiaomi.push.EnumC14898gp;
import com.xiaomi.push.service.C14985ah;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class dzq0 extends tsq0.AbstractRunnableC20394c {

    /* JADX INFO: renamed from: c */
    private Context f91376c;

    /* JADX INFO: renamed from: d */
    private SharedPreferences f91377d;

    /* JADX INFO: renamed from: e */
    private C14985ah f91378e;

    public dzq0(Context context) {
        this.f91376c = context;
        this.f91377d = context.getSharedPreferences(MiPushClient.PREF_EXTRA, 0);
        this.f91378e = C14985ah.m87648a(context);
    }

    /* JADX INFO: renamed from: b */
    private List<C14896gn> m118757b(File file) {
        RandomAccessFile randomAccessFile;
        FileInputStream fileInputStream;
        iyq0 iyq0VarM147616a = jyq0.m147615b().m147616a();
        String strMo142717a = iyq0VarM147616a == null ? "" : iyq0VarM147616a.mo142717a();
        FileLock fileLock = null;
        if (TextUtils.isEmpty(strMo142717a)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        byte[] bArr = new byte[4];
        synchronized (myq0.f139428a) {
            try {
                try {
                    try {
                        File file2 = new File(this.f91376c.getFilesDir(), "push_cdata.lock");
                        j6r0.m143695f(file2);
                        randomAccessFile = new RandomAccessFile(file2, "rw");
                        try {
                            FileLock fileLockLock = randomAccessFile.getChannel().lock();
                            try {
                                fileInputStream = new FileInputStream(file);
                                while (fileInputStream.read(bArr) == 4) {
                                    try {
                                        int iM170921a = p6r0.m170921a(bArr);
                                        byte[] bArr2 = new byte[iM170921a];
                                        if (fileInputStream.read(bArr2) != iM170921a) {
                                            break;
                                        }
                                        byte[] bArrM156377c = lyq0.m156377c(strMo142717a, bArr2);
                                        if (bArrM156377c != null && bArrM156377c.length != 0) {
                                            C14896gn c14896gn = new C14896gn();
                                            C14936m.m87447d(c14896gn, bArrM156377c);
                                            arrayList.add(c14896gn);
                                            m118759d(c14896gn);
                                        }
                                    } catch (Exception unused) {
                                        fileLock = fileLockLock;
                                        if (fileLock != null && fileLock.isValid()) {
                                            fileLock.release();
                                        }
                                        j6r0.m143691b(fileInputStream);
                                        j6r0.m143691b(randomAccessFile);
                                        return arrayList;
                                    } catch (Throwable th) {
                                        th = th;
                                        fileLock = fileLockLock;
                                        if (fileLock != null && fileLock.isValid()) {
                                            try {
                                                fileLock.release();
                                            } catch (IOException unused2) {
                                            }
                                        }
                                        j6r0.m143691b(fileInputStream);
                                        j6r0.m143691b(randomAccessFile);
                                        throw th;
                                    }
                                }
                                if (fileLockLock != null && fileLockLock.isValid()) {
                                    fileLockLock.release();
                                }
                            } catch (Exception unused3) {
                                fileInputStream = null;
                            } catch (Throwable th2) {
                                th = th2;
                                fileInputStream = null;
                            }
                        } catch (Exception unused4) {
                            fileInputStream = null;
                        } catch (Throwable th3) {
                            th = th3;
                            fileInputStream = null;
                        }
                    } catch (IOException unused5) {
                    }
                } catch (Exception unused6) {
                    randomAccessFile = null;
                    fileInputStream = null;
                } catch (Throwable th4) {
                    th = th4;
                    randomAccessFile = null;
                    fileInputStream = null;
                }
                j6r0.m143691b(fileInputStream);
                j6r0.m143691b(randomAccessFile);
            } catch (Throwable th5) {
                throw th5;
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: c */
    private void m118758c() {
        SharedPreferences.Editor editorEdit = this.f91377d.edit();
        editorEdit.putLong("last_upload_data_timestamp", System.currentTimeMillis() / 1000);
        editorEdit.commit();
    }

    /* JADX INFO: renamed from: d */
    private void m118759d(C14896gn c14896gn) {
        if (c14896gn.f62884a != EnumC14890gh.AppInstallList || c14896gn.f62885a.startsWith("same_")) {
            return;
        }
        SharedPreferences.Editor editorEdit = this.f91377d.edit();
        editorEdit.putLong("dc_job_result_time_4", c14896gn.f62883a);
        editorEdit.putString("dc_job_result_4", bvq0.m106588b(c14896gn.f62885a));
        editorEdit.commit();
    }

    /* JADX INFO: renamed from: e */
    private boolean m118760e() {
        if (mtq0.m160048x(this.f91376c)) {
            return false;
        }
        if ((mtq0.m160050z(this.f91376c) || mtq0.m160049y(this.f91376c)) && !m118762g()) {
            return true;
        }
        return (mtq0.m160023A(this.f91376c) && !m118761f()) || mtq0.m160024B(this.f91376c);
    }

    /* JADX INFO: renamed from: f */
    private boolean m118761f() {
        if (!this.f91378e.m87660a(EnumC14893gk.Upload3GSwitch.m86817a(), true)) {
            return false;
        }
        return Math.abs((System.currentTimeMillis() / 1000) - this.f91377d.getLong("last_upload_data_timestamp", -1L)) > ((long) Math.max(MMKV.ExpireInDay, this.f91378e.m87652a(EnumC14893gk.Upload3GFrequency.m86817a(), 432000)));
    }

    /* JADX INFO: renamed from: g */
    private boolean m118762g() {
        if (!this.f91378e.m87660a(EnumC14893gk.Upload4GSwitch.m86817a(), true)) {
            return false;
        }
        return Math.abs((System.currentTimeMillis() / 1000) - this.f91377d.getLong("last_upload_data_timestamp", -1L)) > ((long) Math.max(MMKV.ExpireInDay, this.f91378e.m87652a(EnumC14893gk.Upload4GFrequency.m86817a(), 259200)));
    }

    @Override // p153l.tsq0.AbstractRunnableC20394c
    /* JADX INFO: renamed from: a */
    public String mo87798a() {
        return "1";
    }

    @Override // java.lang.Runnable
    public void run() {
        File file = new File(this.f91376c.getFilesDir(), "push_cdata.data");
        if (!mtq0.m160047w(this.f91376c)) {
            if (file.length() > 1863680) {
                file.delete();
                return;
            }
            return;
        }
        if (!m118760e() && file.exists()) {
            List<C14896gn> listM118757b = m118757b(file);
            if (!q6r0.m175606a(listM118757b)) {
                int size = listM118757b.size();
                if (size > 4000) {
                    listM118757b = listM118757b.subList(size - 4000, size);
                }
                C14907gy c14907gy = new C14907gy();
                c14907gy.m87016a(listM118757b);
                byte[] bArrM143697h = j6r0.m143697h(C14936m.m87448e(c14907gy));
                C14914he c14914he = new C14914he(User.ID_TEAM_ACCOUNT, false);
                c14914he.m87131c(EnumC14898gp.DataCollection.f62957a);
                c14914he.m87118a(bArrM143697h);
                iyq0 iyq0VarM147616a = jyq0.m147615b().m147616a();
                if (iyq0VarM147616a != null) {
                    iyq0VarM147616a.mo142718a(c14914he, EnumC14888gf.Notification, null);
                }
                m118758c();
            }
            file.delete();
        }
    }
}
