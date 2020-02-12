package com.aqil.pdfapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class PDFOpener extends AppCompatActivity {

    PDFView myPDFViewer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdfopener);

        myPDFViewer = (PDFView) findViewById(R.id.pdfViwer);
        String getItem = getIntent().getStringExtra("pdfFileName");

        if (getItem.equals("100_ways_to_motivate_others")){
            myPDFViewer.fromAsset("100_ways_to_motivate_others.pdf").load();
        }

        if (getItem.equals("mumin-sekman-her-sey-seninle-baslar")){
            myPDFViewer.fromAsset("mumin-sekman-her-sey-seninle-baslar.pdf").load();
        }

        if (getItem.equals("rondo-bern-the-secret")){
            myPDFViewer.fromAsset("rondo-bern-the-secret.pdf").load();
        }

        if (getItem.equals("1-2-3 Magic_ 3-Step Discipline for Calm, Effective, and Happy Parenting")){
            myPDFViewer.fromAsset("1-2-3 Magic_ 3-Step Discipline for Calm, Effective, and Happy Parenting ( PDFDrive.com ).pdf").load();
        }

        if (getItem.equals("The Power of Now_ A Guide to Spiritual Enlightenment")){
            myPDFViewer.fromAsset("The Power of Now_ A Guide to Spiritual Enlightenment ( PDFDrive.com ).pdf").load();
        }

        if (getItem.equals("Boundaries_ When to Say Yes, How to Say No to Take Control of Your Life")){
            myPDFViewer.fromAsset("Boundaries_ When to Say Yes, How to Say No to Take Control of Your Life ( PDFDrive.com ).pdf").load();
        }




    }
}
