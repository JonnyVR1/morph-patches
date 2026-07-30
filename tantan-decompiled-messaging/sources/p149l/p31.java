package p149l;

import androidx.annotation.NonNull;
import com.tantanapp.beatles.p072v2.data.MonitorEvent;
import java.io.File;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class p31 implements g4f {

    /* JADX INFO: renamed from: a */
    public final o31 f146954a;

    public p31(o31 o31Var) {
        this.f146954a = o31Var;
    }

    @Override // p149l.g4f
    /* JADX INFO: renamed from: a */
    public void mo81120a(@NonNull MonitorEvent monitorEvent) {
        List<File> files = monitorEvent.getFiles();
        if (files != null) {
            vx00.m200472b("AttachmentsProcessor process start! files size:" + files.size() + " event type:" + monitorEvent.getEventType(), new Object[0]);
        } else {
            vx00.m200472b("AttachmentsProcessor process start! file is null!!!", new Object[0]);
        }
        if (files != null) {
            this.f146954a.m162344n(files, monitorEvent);
        }
    }
}
