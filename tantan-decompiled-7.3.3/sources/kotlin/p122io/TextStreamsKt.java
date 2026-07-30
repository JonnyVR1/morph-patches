package kotlin.p122io;

import com.clevertap.android.sdk.Constants;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.p122io.TextStreamsKt;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt__SequencesKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u001a%\u0010\u0005\u001a\u00020\u0003*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007*\u00020\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b*\u00020\n¢\u0006\u0004\b\f\u0010\r\u001a\u0011\u0010\u000e\u001a\u00020\u0002*\u00020\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a#\u0010\u0015\u001a\u00020\u0014*\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m88121d2 = {"Ljava/io/Reader;", "Lkotlin/Function1;", "", "", "action", Constants.INAPP_DATA_TAG, "(Ljava/io/Reader;Lkotlin/jvm/functions/Function1;)V", "", "f", "(Ljava/io/Reader;)Ljava/util/List;", "Ljava/io/BufferedReader;", "Lkotlin/sequences/Sequence;", "e", "(Ljava/io/BufferedReader;)Lkotlin/sequences/Sequence;", "g", "(Ljava/io/Reader;)Ljava/lang/String;", "Ljava/io/Writer;", "out", "", "bufferSize", "", "b", "(Ljava/io/Reader;Ljava/io/Writer;I)J", "kotlin-stdlib"}, m88122k = 2, m88123mv = {2, 2, 0}, m88125xi = 48)
@JvmName
@SourceDebugExtension
public final class TextStreamsKt {
    /* JADX INFO: renamed from: a */
    public static Unit m88308a(ArrayList arrayList, String str) {
        str.getClass();
        arrayList.add(str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: b */
    public static final long m88309b(@NotNull Reader reader, @NotNull Writer writer, int i) throws IOException {
        reader.getClass();
        writer.getClass();
        char[] cArr = new char[i];
        int i2 = reader.read(cArr);
        long j = 0;
        while (i2 >= 0) {
            writer.write(cArr, 0, i2);
            j += (long) i2;
            i2 = reader.read(cArr);
        }
        return j;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ long m88310c(Reader reader, Writer writer, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 8192;
        }
        return m88309b(reader, writer, i);
    }

    /* JADX INFO: renamed from: d */
    public static final void m88311d(@NotNull Reader reader, @NotNull Function1<? super String, Unit> function1) {
        reader.getClass();
        function1.getClass();
        BufferedReader bufferedReader = reader instanceof BufferedReader ? (BufferedReader) reader : new BufferedReader(reader, 8192);
        try {
            Iterator<String> it = m88312e(bufferedReader).iterator();
            while (it.hasNext()) {
                function1.invoke(it.next());
            }
            Unit unit = Unit.INSTANCE;
            CloseableKt.m88293a(bufferedReader, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CloseableKt.m88293a(bufferedReader, th);
                throw th2;
            }
        }
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public static final Sequence<String> m88312e(@NotNull BufferedReader bufferedReader) {
        bufferedReader.getClass();
        return SequencesKt__SequencesKt.m94159h(new LinesSequence(bufferedReader));
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public static final List<String> m88313f(@NotNull Reader reader) {
        reader.getClass();
        final ArrayList arrayList = new ArrayList();
        m88311d(reader, new Function1() { // from class: l.gsi0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TextStreamsKt.m88308a(arrayList, (String) obj);
            }
        });
        return arrayList;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public static final String m88314g(@NotNull Reader reader) {
        reader.getClass();
        StringWriter stringWriter = new StringWriter();
        m88310c(reader, stringWriter, 0, 2, null);
        String string = stringWriter.toString();
        string.getClass();
        return string;
    }
}
