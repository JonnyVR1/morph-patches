package p153l;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m88121d2 = {"Ll/wa00;", "Ll/ua00;", "<init>", "()V", "Ll/n7h0;", "db", "", "a", "(Ll/n7h0;)V", "work-runtime_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
public final class wa00 extends ua00 {

    @NotNull
    public static final wa00 INSTANCE = new wa00();

    public wa00() {
        super(12, 13);
    }

    @Override // p153l.ua00
    /* JADX INFO: renamed from: a */
    public void mo96672a(@NotNull n7h0 db) {
        db.getClass();
        db.execSQL("UPDATE workspec SET required_network_type = 0 WHERE required_network_type IS NULL ");
        db.execSQL("UPDATE workspec SET content_uri_triggers = x'' WHERE content_uri_triggers is NULL");
    }
}
