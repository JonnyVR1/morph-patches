package com.mp4parser.iso14496.part30;

import com.coremedia.iso.boxes.sampleentry.AbstractSampleEntry;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import l.b5c;
import l.qe3;
import l.sa60;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class WebVTTSampleEntry extends AbstractSampleEntry {
    public static final String TYPE = "wvtt";

    public WebVTTSampleEntry() {
        super(TYPE);
    }

    public void getBox(WritableByteChannel writableByteChannel) throws IOException {
        writableByteChannel.write(getHeader());
        writeContainer(writableByteChannel);
    }

    public WebVTTConfigurationBox getConfig() {
        return sa60.c(this, WebVTTConfigurationBox.TYPE);
    }

    public WebVTTSourceLabelBox getSourceLabel() {
        return sa60.c(this, WebVTTSourceLabelBox.TYPE);
    }

    public void parse(b5c b5cVar, ByteBuffer byteBuffer, long j, qe3 qe3Var) throws IOException {
        initContainer(b5cVar, j, qe3Var);
    }
}
